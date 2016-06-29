package brain.lab_2_4.labs.tasks._2_4_1;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public class MyMath {
    //lab2.4.3
    public final static double pi =3.14;

    public static double areaOfCircle(double r){
       return  pi*r*r;
   }


    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i])
                min=arr[i];
        }

        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
