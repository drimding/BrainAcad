package brain.lab_1_5.task3;

/**
 * Created by drimcatcher on 21.06.2016.
 */
public class main {
    public static void main(String[] argn) {

        int length = 9; // Set table size

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.printf("%4d", i * j);
                if (j == 1) System.out.print(" |");
                else {
                    if (j % length == 0) System.out.println();
                    if (i == 1 && j == length) {
                        System.out.print("   ");
                        for (int k = 0; k < length; k++) {
                            System.out.print("----");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
