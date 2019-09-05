package steps;

import Pages.RoomSizeCalculatorPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;
import utilities.Wait;

public class AreaCalculator {

    RoomSizeCalculatorPage rscp = new RoomSizeCalculatorPage();
    private int widthAFeet = 6;
    private int widthAInches = 8;
    private int lengthAFeet = 14;
    private int lengthAInches = 2;
    private int widthBFeet = 10;
    private int widthBInches = 2;
    private int lengthBFeet = 20;
    private int lengthBInches = 0;

    private double widthAMeters = 4;
    private double lengthAMeters = 8;
    private double widthBMeters = 3;
    private double lengthBMeters = 4;


    @Given("User on the calculator page")
    public void user_on_the_calculator_page() {
        String expectedPage = "Room Size Calculator - Good Calculators";
        String actualPage = Driver.getDriver().getTitle();
        Assert.assertEquals("User is not on Room Size Calculator page", actualPage, expectedPage);
    }

    @When("User select measure unit: Feet")
    public void user_select_measure_unit_Feet() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,800)");
        Wait.wait.until(ExpectedConditions.elementToBeClickable(rscp.feet));
        rscp.feet.click();
        Assert.assertTrue(rscp.widthAIn.isDisplayed());

    }

    @When("User provides dimensions in feet and inches")
    public void user_provides_dimensions_in_feet_and_inches() {
        rscp.widthAFt.clear();
        rscp.widthAFt.sendKeys(widthAFeet + "");
        rscp.widthAIn.clear();
        rscp.widthAIn.sendKeys(widthAInches + "");
        rscp.lengthAFt.clear();
        rscp.lengthAFt.sendKeys(lengthAFeet + "");
        rscp.lengthAIn.clear();
        rscp.lengthAIn.sendKeys(lengthAInches + "");

        rscp.widthBFt.clear();
        rscp.widthBFt.sendKeys(widthBFeet + "");
        rscp.widthBIn.clear();
        rscp.widthBIn.sendKeys(widthBInches + "");
        rscp.lengthBFt.clear();
        rscp.lengthBFt.sendKeys(lengthBFeet + "");
        rscp.lengthBIn.clear();
        rscp.lengthBIn.sendKeys(lengthBInches + "");
    }

    @When("User select measure unit: Meters")
    public void user_select_measure_unit_Meters() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,800)");
        Wait.wait.until(ExpectedConditions.elementToBeClickable(rscp.meters));
        rscp.meters.click();
        Assert.assertTrue(rscp.widthAM.isDisplayed());
    }

    @When("User provides dimensions in meters")
    public void user_provides_dimensions_in_meters() {
        rscp.widthAM.clear();
        rscp.widthAM.sendKeys(widthAMeters + "");
        rscp.lengthAM.clear();
        rscp.lengthAM.sendKeys(lengthAMeters + "");

        rscp.widthBM.clear();
        rscp.widthBM.sendKeys(widthBMeters + "");
        rscp.lengthBM.clear();
        rscp.lengthBM.sendKeys(lengthBMeters + "");
    }

    @When("User click to Calculate button")
    public void user_click_to_Calculate_button() {
        rscp.calculateButton.click();
    }

    @Then("User has to get result of total area of room")
    public void user_has_to_get_result_of_total_area_of_room() {
        double expectedTotalArea, expectedAreaWithWastage;
        double wastage = 0.1;
        String actualTotalAreaFullText, actualTotalAreaText, actualAreaWithWastageText;

        actualTotalAreaFullText = rscp.totalAreaValueSqFt.getText();
        actualTotalAreaText = rscp.totalAreaValueSqFt.getText().substring(0,
                (rscp.totalAreaValueSqFt.getText().indexOf(" ")));
        actualAreaWithWastageText = rscp.totalAreaValueWithWastageSqFt.getText().substring(0,
                (rscp.totalAreaValueWithWastageSqFt.getText().indexOf(" ")));

//        Result verification in Feet
        if (actualTotalAreaFullText.contains(" ft.")) {
            expectedTotalArea = Math.round((((widthAFeet + (Double.valueOf(widthAInches)/12)) * (lengthAFeet + (Double.valueOf(lengthAInches)/12)))
                    + ((widthBFeet + (Double.valueOf(widthBInches)/12)) * (lengthBFeet + (Double.valueOf(lengthBInches)/12))))*100.0)/100.0;
            expectedAreaWithWastage = Math.round((expectedTotalArea + (expectedTotalArea * wastage))*100.0)/100.0;

            Assert.assertEquals("Test FAILED! Total Area value is not correct", (expectedTotalArea + ""), actualTotalAreaText);
            Assert.assertEquals("TEST FAILED! Total Area with Wastage value is not correct", expectedAreaWithWastage + "", actualAreaWithWastageText);
        } else

//        Result verification in Meters
        {
            expectedTotalArea = ((widthAMeters * lengthAMeters) + (widthBMeters * lengthBMeters));
            expectedAreaWithWastage = expectedTotalArea + (expectedTotalArea * wastage);

            Assert.assertEquals("Test FAILED! Total Area value is not correct", (expectedTotalArea + "").substring(0, ((expectedTotalArea + "").indexOf("."))), actualTotalAreaText);
            Assert.assertEquals("TEST FAILED! Total Area with Wastage value is not correct", expectedAreaWithWastage + "", actualAreaWithWastageText);
        }
    }

    @When("User click on Clear button")
    public void user_click_on_Clear_button() {
        rscp.clearButton.click();
    }

    @Then("User has to get all fields empty")
    public void user_has_to_get_all_fields_empty() {
        String actualTotalAreaText = rscp.totalAreaValueSqFt.getText();
        String actualAreaWithWastageText = rscp.totalAreaValueWithWastageSqFt.getText();
        String expectedTotalAreaText = "0 sq. ft.";
        String expectedAreaWithWastageText = "0 sq. ft.";

        Assert.assertEquals("Test FAILED! Total Area value is not correct", actualTotalAreaText, expectedTotalAreaText);
        Assert.assertEquals("TEST FAILED! Total Area with Wastage value is not correct", actualAreaWithWastageText, expectedAreaWithWastageText);
    }
}
