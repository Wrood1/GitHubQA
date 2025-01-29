package GitHubWeb;

import Base.BaseClase;
import Pages.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class GitHubTest extends BaseClase {
    public void loginPageMethod()throws InterruptedException{
      WebDriver driver = new ChromeDriver(); // أو أي متصفح آخر
        LoginPages login = new LoginPages(driver);
        login.openUrl();
        Thread.sleep(2000); // انتظر تحميل الصفحة
        login.clickOnSignUp();
        Thread.sleep(2000); // انتظر تحميل صفحة التسجيل
        login.clickOnEmail();
        Thread.sleep(300);
        login.clickOnPassword();
        Thread.sleep(300);

        login.clickOnGitHubPrivacyStatement();
        Thread.sleep(300);
        Thread.sleep(2000); // انتظر تحميل صفحة التسجيل

       // login.clickOnTermsOfsSrvice();

    }

}
