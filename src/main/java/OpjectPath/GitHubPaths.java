package OpjectPath;

import org.openqa.selenium.By;

public class GitHubPaths {

    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");

    public static final By username = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By signInBtn = By.xpath("//input[@name='commit']");
    public static final By signUp = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");
    public static final By email = By.xpath("/html/body/div[1]/div[4]/div/main/div/div[2]/div[2]/div/div[2]/div/form/div[2]/div[1]/div/auto-check/input[1]");
    public static final By termsOfsSrvice = By.xpath("//*[@id=\"terms-of-service\"]/a[1]");
    public static final By  GitHubPrivacyStatement = By.xpath("/html/body/div[1]/div[4]/div/main/div/div[2]/div[2]/div/div[2]/div/form/div[6]/p/a[2]");


}
