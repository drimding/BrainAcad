package brain.lab_2_16.tasks.task_02;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class Main {
    public static void main(String[] args){
        int i = 10;
        byte b = 20;
        Byte bb = 30;

        foo(b);
        foo(bb);
        foo(i);


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

}
