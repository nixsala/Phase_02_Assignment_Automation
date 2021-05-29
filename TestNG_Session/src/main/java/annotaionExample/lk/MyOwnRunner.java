package annotaionExample.lk;

public class MyOwnRunner {

    public void method1(){
        System.out.println("Method1");
    }
@CanRun
    public void method2(){
        System.out.println("Method2");
    }

    public void method3(){
        System.out.println("Method3");
    }

    @CanRun
    public void method4(){
        System.out.println("Method4");
    }
}
