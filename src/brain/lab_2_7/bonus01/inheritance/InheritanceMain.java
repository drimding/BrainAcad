package brain.lab_2_7.bonus01.inheritance;

import brain.lab_2_7.bonus01.inheritance.move.Eater;
import brain.lab_2_7.bonus01.inheritance.workers.Developer;
import brain.lab_2_7.bonus01.inheritance.workers.QA;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class InheritanceMain {
    public static void main(String[]args){
        demo();
    }

    private static void demo(){
        Developer mykola = new Developer("Mykola", 5646L, "web");
        Developer mykola2 = new Developer("Mykola", 3352L, "web");
        QA olga = new QA("olga", 11225L, "manual");

/*        System.out.println(mykola+"\n");
        System.out.println(olga);*/


       System.out.println(mykola==mykola2);
        System.out.println(mykola.equals(mykola2));

        Eater[] eaters = {olga, mykola, mykola2};
        for (Eater eater :eaters)
            eater.eat();
    }
}
