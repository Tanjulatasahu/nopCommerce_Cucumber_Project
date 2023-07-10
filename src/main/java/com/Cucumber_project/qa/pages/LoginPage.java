package com.Cucumber_project.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="Email")
    WebElement name;


    @FindBy(id="Password")
    WebElement pswrd;

    @FindBy(xpath="//button[text()='Log in']")
    WebElement loginbtn;

    @FindBy(xpath="//a[text()='Logout']")
    WebElement logoutbtn;

    public void uName(String username){
        name.clear();
         name.sendKeys(username);
    }

    public void pwd(String password){
        pswrd.clear();
        pswrd.sendKeys(password);
    }

    public void clickLogin(){
        loginbtn.click();
    }

    public void clickLogout(){
        logoutbtn.click();
    }

}
