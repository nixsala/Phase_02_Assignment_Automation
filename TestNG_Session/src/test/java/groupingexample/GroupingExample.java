package groupingexample;

import org.testng.annotations.Test;

@Test(groups = {"functest"})

public class GroupingExample {

    @Test(groups = {"checkintest"})
    public void testMethod1() {
        System.out.println("func and checkin 1");
    }


    @Test(groups = {"checkintest"})
    public void testMethod2() {
        System.out.println("func and checkin 2");
    }

    @Test
    public void testMethod3() {
        System.out.println("func 3");

    }


}


