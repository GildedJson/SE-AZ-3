package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs2 {
    private Calculator calculator;
    private int value1;
    private int value2;
    private char opt;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), and a sign ([*^/])$")
    public void twoInputValuesAndAndASign(int arg0, int arg1, char arg2) {
        value1 = arg0;
        value2 = arg1;
        opt = arg2;
    }

    @When("^I calculate the equation$")
    public void iCalculateTheEquation() {
        result = calculator.calculate(value1, value2, opt);
        System.out.print(result);
    }

    @Then("^I expect the result number (-?\\d+)$")
    public void iExpectTheResultNumber(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
