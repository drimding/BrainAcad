package brain.lab_1_6.task01;

/**
 * Created by drimcatcher on 16.06.2016.
 */
public class main {
    public static void main (String[] args){
        int[] arr = new int[15];
        int counter =2;
        for (int i=0; i<arr.length; i++){
            arr[i]=counter;
            counter+=2;
        }

        for (int i=0; i<arr.length; i++) {
            if(i%3==0 && i!=0)
                System.out.println();
                System.out.printf("%-5d ", arr[i]);
            }
        }
    }

