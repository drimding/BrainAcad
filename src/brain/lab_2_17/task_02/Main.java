package brain.lab_2_17.task_02;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class Main {
    public static void main(String[] args){
        MyTimeBomb bomb = new MyTimeBomb("bomb 1");
        MyTimeBomb bomb2 = new MyTimeBomb("bomb 2");
        Thread thread = new Thread(bomb);
        thread.start();

    }
}
