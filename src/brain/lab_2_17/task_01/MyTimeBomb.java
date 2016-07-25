package brain.lab_2_17.task_01;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class MyTimeBomb extends Thread {


    @Override
    public void run(){
      for (int i=10; i>0; i--){
          System.out.println(this.getName()+ "  " +i);
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
        System.out.println(0);
        System.out.println(this.getName() +" Boom");
    }
}
