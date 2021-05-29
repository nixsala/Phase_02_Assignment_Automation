package groupingexample;

import org.testng.annotations.Test;

public class GroupingExample2 {

    @Test(groups = {"functest", "checkintest"})
    public void testMethod4() {
        System.out.println("func and checkin 3");
    }

    @Test(groups = {"functest", "checkintest"})
    public void testMethod5() {
        System.out.println("func and checkin 4");
    }

    @Test(groups = {"functest"})
    public void testMethod6() {
        System.out.println("func 4");
    }


}
