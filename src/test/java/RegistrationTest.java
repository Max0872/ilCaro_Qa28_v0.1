import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{


    @Test

            public void testPosReg() {
        app.userHelper().openRegForm();
        app.userHelper().fillRegForm("Maks", "Mayzel","maxmay0872@gmail.com","Rfrnec12");
        app.userHelper().agree();
        app.userHelper().pause(7000);
        app.userHelper().clickOkButton();
        String regS=app.userHelper().getText(By.xpath("//div[@class='dialog-container']//h2"));
        Assert.assertTrue(regS.contains("success"));

    }

}
