package brain.lab_2_4.bonus01.tasks;

import brain.lab_2_4.bonus01.tasks._2_4_1.ArraysAlgoritms;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public interface StaticClassMembers {
    static void demo(){
        lab_2_4_1();
    }
    static void lab_2_4_1(){
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6,7};
        int array1NumbersOfOdd = ArraysAlgoritms.getNumbersOfOdds(array1);
        int array1NumbersOfEven = ArraysAlgoritms.getNumberOfEvens(array1);

        int array2NumbersOfOdd = ArraysAlgoritms.getNumbersOfOdds(array2);
        int array2NumbersOfEven = ArraysAlgoritms.getNumberOfEvens(array2);

        System.out.printf("Number of odds values in first arra is %d\n" +
                "Number of events values in first arra is %d\n" +
                "Number of odds values in second arra is %d\n" +
                "Number of events values in second arra is %d\n",
                array1NumbersOfOdd, array1NumbersOfEven, array2NumbersOfOdd, array2NumbersOfEven);
    }


}

