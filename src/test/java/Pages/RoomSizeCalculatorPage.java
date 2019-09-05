package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomSizeCalculatorPage {

    WebDriver driver;

    public RoomSizeCalculatorPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //    List of WebElements:

    //    Selection measure units
    @FindBy(id = "calculate-ft")
    public WebElement feet;

    @FindBy(id = "calculate-mt")
    public WebElement meters;

    //    Feet
    //    Section 1
    @FindBy(id = "w-ft1")
    public WebElement widthAFt;

    @FindBy(id = "w-in1")
    public WebElement widthAIn;

    @FindBy(id = "len-ft1")
    public WebElement lengthAFt;

    @FindBy(id = "len-in1")
    public WebElement lengthAIn;

    //    Section 2
    @FindBy(id = "w-ft2")
    public WebElement widthBFt;

    @FindBy(id = "w-in2")
    public WebElement widthBIn;

    @FindBy(id = "len-ft2")
    public WebElement lengthBFt;

    @FindBy(id = "len-in2")
    public WebElement lengthBIn;

    //    Meters
    //    Section 1
    @FindBy(id = "wth-m1")
    public WebElement widthAM;

    @FindBy(id = "len-m1")
    public WebElement lengthAM;

    @FindBy(id = "wth-m2")
    public WebElement widthBM;

    @FindBy(id = "len-m2")
    public WebElement lengthBM;

    //    Buttons
    @FindBy(xpath = "//p/button[@type='submit']")
    public WebElement calculateButton;

    @FindBy(xpath = "//p/button[@type='reset']")
    public WebElement clearButton;

    //    Results
    @FindBy(id = "totarea-res")
    public WebElement totalAreaValueSqFt;

    @FindBy(id = "totarea-res-10-perc")
    public WebElement totalAreaValueWithWastageSqFt;

}
