package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    UserHelper userHelper;
    CarHelper carhelper;

    public CarHelper getCarhelper() {
        return carhelper;
    }

    public void init(){
        wd= new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://ilcarro.xyz/search");
        userHelper = new UserHelper(wd);
        carhelper = new CarHelper(wd);
    }

    public void stop(){
        wd.quit();
    }

    public UserHelper userHelper() {
        return userHelper;
    }
}
