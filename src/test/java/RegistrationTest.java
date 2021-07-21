import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{


    @Test

            public void testPosReg() {
        app.userHelper().openRegForm();
        app.userHelper().fillRegForm("Maks", "Mayzel","maxmay0872@gmail.com","Rfrnec12");
        app.userHelper().agree();
        app.userHelper().pause(3000);
        //String loginS = app.userHelper().getText(By.xpath("//div[@class='dialog-container']//h2"));
        app.userHelper().clickOkButton();

    }

}
