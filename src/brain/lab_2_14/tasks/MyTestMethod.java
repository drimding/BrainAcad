package brain.lab_2_14.tasks;

/**
 * Created by drimcatcher on 24.07.2016.
 */
public class MyTestMethod {

    public static <T extends Number> void calcNum(T[] arr , T maxElm){
        int valueElm = 0;
        int valueCalc=0;
        System.out.print("Array values: [");
        for (int i=0; i<arr.length; i++) {
            if(i>0)System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println("]");
        if (maxElm instanceof Integer ) {
            valueElm = (Integer) maxElm;
        }
        if(arr.length>=valueElm) valueCalc = arr.length-valueElm;
        System.out.printf("Number of elements that are greater than %d:\n%d\n",  valueElm, valueCalc );
    }
    public static <T extends Number> void calcSum(T[] arr, T maxVal){
        T summ=null;
        int sumInt=0;
        double sumDouble=0;

        int valueMax = 0;
        if (maxVal instanceof Integer) {
            if ((Integer)maxVal < arr.length)
            valueMax = (Integer) maxVal;
        }
        if (arr instanceof Integer[]){

            for (int i = valueMax; i<arr.length; i++){
                sumInt+=(Integer) arr[valueMax];
            }
            summ = (T) new Integer(sumInt);
        }
        if (arr instanceof Double[]){
             for (int i = valueMax; i<arr.length; i++){
                 sumDouble+=(Double) arr[valueMax];
            }
            summ = (T) new Double(sumDouble);
        }
        System.out.print("Array values: [");
        for (int i=0; i<arr.length; i++) {
            if(i>0)System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println("]");
        System.out.printf("Sum of elements that are greater than %s:\n%s\n", maxVal, summ );

    }
}
