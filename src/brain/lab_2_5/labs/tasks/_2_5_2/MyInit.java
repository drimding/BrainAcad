package brain.lab_2_5.labs.tasks._2_5_2;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public class MyInit {
    private int[] arr;

    {
        arr= new int[10];
        for (int i =0; i<arr.length; i++){
            arr[i]= (int) (100 * Math.random());
        }

    }

    public void printArray(){
        for (int array : arr )
        {
            System.out.printf("%d ", array);
        }
        System.out.println();
    }

}
