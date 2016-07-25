package brain.lab_1_5.task5;

import java.util.Random;

/**
 * Created by drimcatcher on 20.06.2016.
 */
public class main {
    public static void main (String[] args){
        int[] arr = new int[25];
        Random r = new Random(System.currentTimeMillis());
        int min=1;
        int max=776;
        int sum=0;
        double avg;
        for (int i = 0; i<arr.length; i++)
        {
            arr[i]=min + r.nextInt(max - min + 1);
        }

        for (int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
            if(i%5==0 && i!=0)
                System.out.println();
            System.out.printf("%-5d ", arr[i]);
        }
        System.out.printf("\nSum: %d\nAvg: %.2f", sum, (double)sum/arr.length);
    }
}
