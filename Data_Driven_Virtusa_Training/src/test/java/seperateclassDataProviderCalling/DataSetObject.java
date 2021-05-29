package seperateclassDataProviderCalling;

import org.testng.annotations.DataProvider;

public class DataSetObject {


    @DataProvider(name="loginDetails")
    public Object[][] getData() {
        Object[][] loginData = {{"nixsala", "happy456"}, {"abimaaran", "himlk456"}};
        return loginData;
    }
}
