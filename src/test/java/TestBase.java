

import application.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected static ApplicationManager app =new ApplicationManager();

    @BeforeClass
    public void start(){
        app.init();

    }


    @AfterClass
    public void tearDown(){

        app.stop();
    }


}