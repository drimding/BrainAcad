package brain.lab_1_6.taskBonus01;

import java.util.Scanner;

/**
 * Created by drimcatcher on 16.06.2016.
 */
class main {
    public static void main(String[] args)
    {
        System.out.println(checkLogic(new Scanner(System.in).nextInt()));
    }

    public static String checkLogic(int value)
    {
        String number="";
        if (value>0) number="Positive";
        else
        if (value<0) number="Negative";
        else
         number="Zero";

        return number;
    }


}



