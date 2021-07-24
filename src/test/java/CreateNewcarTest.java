import application.CarHelper;
import application.HelperBase;
import models.Car;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewcarTest extends TestBase {


    @BeforeMethod
    public void preconditions(){
      //login
    }


    @Test
    public void createNewCar(){

        int i = (int) ((System.currentTimeMillis()/1000%3600));
        System.out.println(i);

        Car car = Car.builder()
                .address("Tel Aviv, Israel")
                .make("BMW")
                .model("M5")
                .year("2020")
                .engine("2.0")
                .fuel("Petrol")
                .gear("MT")
                .wD("AWD")
                .doors("5")
                .seats("4")
                .clasS("C")
                .fuelConsumption("6.5")
                .carRegNumber("102-67-12")
                .price("65")
                .distanceIncluded("500")
                .typeFeature("type of")
                .about("Very good car")
                .build();
        System.out.println("Car Num --->"+car.getCarRegNumber());
    app.getCarhelper().openCarForm();
    app.getCarhelper().fillCarForm(car);
    app.getCarhelper().attachPhoto();
        Assert.assertTrue(app.getCarhelper().isCarAdded());
    }



}
