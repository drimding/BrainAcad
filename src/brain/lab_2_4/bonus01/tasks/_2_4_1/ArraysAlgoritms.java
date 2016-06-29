package brain.lab_2_4.bonus01.tasks._2_4_1;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public class ArraysAlgoritms {
    public static int getNumbersOfOdds(int[] array)
   {
       int numberOfOdds =0;
      for (int element : array) {
          if (element % 2 > 0) {
              ++numberOfOdds;
          }
      }
       return numberOfOdds;
    }

    public static int getNumberOfEvens(int[] array)
    {
        int numberOfEvens = 0;
        for (int element : array){
            if (element%2==0){
                ++numberOfEvens;
            }
        }
        return numberOfEvens;
    }
}
