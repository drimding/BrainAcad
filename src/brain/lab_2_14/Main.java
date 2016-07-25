package brain.lab_2_14;

import brain.lab_2_14.tasks.MyMixer;
import brain.lab_2_14.tasks.MyTestMethod;

/**
 * Created by drimcatcher on 24.07.2016.
 */
public class Main {
    public static void main (String[]args){
        MyTestMethod.calcSum(new Integer[]{6,1,2,3,4,4},4);
        MyTestMethod.calcSum(new Double[]{10.2,9.4,8.2,7.6,4.7,5.6,6.1,3.2,2.2,1.2,4.2,2.1},2);
        /*----------------------------------------------------------------------------------------*/
        MyTestMethod.calcNum(new Integer[]{6,1,2,3,4,4},4);
        MyTestMethod.calcNum(new Double[]{10.2,9.4,8.2,7.6,4.7,5.6,6.1,3.2,2.2,1.2,4.2,2.1},2);
        /*----------------------------------------------------------------------------------------*/
        MyMixer<String> mixer = new MyMixer<>(new String[]{"a","b","c","d","e","f"});
        MyMixer<Integer> mixer2 = new MyMixer<>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        mixer2.shuffle();
        mixer.shuffle();
    }
}
