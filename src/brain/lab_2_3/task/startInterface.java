package brain.lab_2_3.task;

import brain.lab_2_3.task._2_3_1.MyWindow;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public interface startInterface {
    static void demo(){
        lab_2_3();

    }

    static void lab_2_3(){
        MyWindow[] arr = new MyWindow[5];
        arr[0] = new MyWindow();
        arr[1] = new MyWindow(140, 90);
        arr[2] = new MyWindow(200, 50, 5);
        arr[3] = new MyWindow(true, "red", 3);
        arr[4] = new MyWindow(100, 90, 6, "Green", false);

        for (MyWindow window :arr)
            window.printFields();


    }


}

