
package application;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openRegForm() {
        click(By.cssSelector("[href=\"/registration?url=%2Fsearch\"]"));
    }

    public void fillRegForm(String name, String lastName,String email,String password) {
        type(By.xpath("//input[@id='name']"),email);
        type(By.xpath("//input[@id='lastName']"),password);
        type(By.xpath("//input[@id='email']"),email);
        type(By.xpath("//input[@id='password']"),password);
    }

    public void agree() {
        click(By.xpath("//label[contains(text(),\"I agree to the\")]"));
    }
    public void clickOkButton() {
        click(By.xpath("//button[contains(text(),\"Y’alla!\")]"));
    }
}
