package annotaionExample.lk;

import java.lang.reflect.Method;

public class RunMethods {
    public static void main(String[] args) {


    MyOwnRunner runner=new MyOwnRunner();
    Method[] methods=runner.getClass().getMethods();

    for(Method method:methods){
        CanRun annos=method.getAnnotation(CanRun.class);
        if (annos!=null){
            try {
                method.invoke(runner);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
}