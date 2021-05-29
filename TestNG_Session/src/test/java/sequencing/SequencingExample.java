package sequencing;

import org.testng.annotations.*;

public class SequencingExample {
    @Test
    public void testcase1() {
        System.out.println("This is the Normal Test Case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This execute before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This execute after every method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This execute before every class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(" This execute after every  class ");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This execute before every test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(" This execute after every  test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This execute before every suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(" This execute after every  suite ");
    }
}
