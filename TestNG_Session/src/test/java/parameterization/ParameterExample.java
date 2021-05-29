package parameterization;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Parameters({"f-name", "last_name"})
    @Test
    public void testParamters(String firstName, String lastName) {
        Reporter.log("Asserting fname ", true);
        Assert.assertEquals("Cedric", firstName);
        Reporter.log("Asserting last name", true);
        Assert.assertEquals("Murphy", lastName);
    }

    @Parameters({"not defined"})
    @Test
    public void testDefaultParameters(@Optional("Default") String notSet) {
        Reporter.log("asserting default parameter, ", true);
        Assert.assertEquals("Default", notSet);
    }

    @Test(dataProvider = "test1")
    public void verifyData1(String N1, Integer n2, double value) {
        System.out.println(N1 + "" + n2 + "" + value);

    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                {"Cedric", new Integer(36), 10.0},
                {"Anne", new Integer(37), 20.0}
        };
    }


}
