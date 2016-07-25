package brain.lab_2_16.tasks.task_03;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class Main {
    public static void main(String[] args){
        foo(25, 25, 65);
        foo(25, 26);
    }
    public static void foo(int i){
        System.out.println("int");
    }
    public static void foo(Byte i){
        System.out.println("Byte");
    }
    public static void foo(byte i){
        System.out.println("byte");
    }
    public static void foo(int a, int b){
        System.out.println("int a, int b");
    }
    public static void foo (int... i){
        System.out.println("varargs");
    }

}
