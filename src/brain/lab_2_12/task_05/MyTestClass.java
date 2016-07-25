package brain.lab_2_12.task_05;

/**
 * Created by drimcatcher on 07.07.2016.
 */
public class MyTestClass {
    private String outer = "field outer";
    private static String outerStatic = "static field outer";

    public void test(){}

    public static class MyStaticNested{
       public void printOuter(){
           System.out.println("Acces static nested:");
           System.out.println(outerStatic);
       }

    }
    public class MyInner{
        public void printOuter(){
            System.out.println("Acces inner:");
            System.out.println(outer);
            System.out.println(outerStatic);
        }

    }

    public Object method(){
        class MyLocal implements testLocal{
            public void printOuter(){
                System.out.println("Acces Local:");
                System.out.println(outer);
                System.out.println(outerStatic);
            }
        }
        return new MyLocal();
    }
}
