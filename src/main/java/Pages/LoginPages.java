package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static OpjectPath.GitHubPaths.*;

public class LoginPages {
    WebDriver driver =null;

    public LoginPages(WebDriver driver) {
        this.driver=driver;
    }
    public void openUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }
    public void clickOnSignUp(){
        WebElement signUpBtn = driver.findElement(signUp);
        signUpBtn.click();
    }

    public void clickOnGitHubPrivacyStatement(){
        WebElement GitHubPrivacyStatementBtn = driver.findElement(GitHubPrivacyStatement);
        GitHubPrivacyStatementBtn.click();
    }
    public void clickOnEmail(){
        WebElement emailField = driver.findElement(email);
        emailField.click();
    }
    public void clickOnPassword(){
        WebElement passwordField = driver.findElement(password);
        passwordField.click();
    }


    public void clickOnTermsOfsSrvice() {
        WebElement termsOfsSrviceBtn;
        termsOfsSrviceBtn = driver.findElement(termsOfsSrvice);
        termsOfsSrviceBtn.click();
    }

}