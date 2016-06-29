package brain.lab_2_5.labs.tasks._2_5_1;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public class MyInitTest {

    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest(){
        this(25);
        System.out.println("constructor 1");

    }

    MyInitTest(int m){
        System.out.println("constructor 2");
    }
}
