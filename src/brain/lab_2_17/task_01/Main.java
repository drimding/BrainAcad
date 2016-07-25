package brain.lab_2_17.task_01;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class Main {
    public static void main (String[] args) throws InterruptedException {
        MyTimeBomb bomb1 = new MyTimeBomb();
        MyTimeBomb bomb2 = new MyTimeBomb();
        bomb1.start();
        Thread.sleep(1000);
        bomb2.start();
    }
}
