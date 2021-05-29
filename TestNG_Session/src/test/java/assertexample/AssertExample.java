package assertexample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.*;

public class AssertExample {

    @Test
    public void testAssert() {
        //Variable Declaration
        String strin1 = "Junit";
        String strin2 = "Junit";
        String strin3 = "test";
        String strin4 = "test";
        String strin5 = null;


        int variable1 = 1;
        int variable2 = 2;

        Object a = new Object();
        Object c = a;
        Object b = new AssertExample();
        int[] arithmaticArray1 = {1, 2, 3};
        int[] arithmaticArray2 = {1, 2, 3};


        //Assert statements
        assertEquals(strin1,strin2);
//        assertSame(a,b,"Both objects are not the same");
        assertNull(strin1);
        assertNull(strin5);
        assertNull(strin3);
        assertTrue(variable1<variable2);
    }

        @Test
                public void testSoftAssert(){

            //Variable Declaration
            String strin1 = "Junit";
            String strin2 = "Junit";
            String strin3 = "test";
            String strin4 = "test";
            String strin5 = null;


            int variable1 = 1;
            int variable2 = 2;

            Object a = new Object();
            Object c = a;
            Object b = new AssertExample();
            int[] arithmaticArray1 = {1, 2, 3};
            int[] arithmaticArray2 = {1, 2, 3};

            SoftAssert softassert=  new SoftAssert();
            softassert.assertEquals(strin1,strin2);
            softassert.assertSame(a,b);
            softassert.assertNotNull(strin1);
            softassert.assertNull(strin5);
            softassert.assertNull(strin3);
            softassert.assertTrue(variable1<variable2);
            softassert.assertAll();



        }




    }


