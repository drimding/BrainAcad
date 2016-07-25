package brain.lab_2_17.task_02;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class MyTimeBomb implements Runnable {
    private String name;
    MyTimeBomb(){}
    MyTimeBomb(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i=10; i>0; i--){
            System.out.println(name+ "  " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(0);
        Thread thread = new Thread(()-> System.out.println("Thread in thread"));
        System.out.println(name +" Boom");
    }
}
