package brain.lab_2_5.labs.tasks;

import brain.lab_2_5.labs.tasks._2_5_1.MyInitTest;
import brain.lab_2_5.labs.tasks._2_5_5.InitTest;


/**
 * Created by drimcatcher on 25.06.2016.
 */
public interface startInterface {
    static void demo(){
        //lab_2_5_1();
        //lab_2_5_2();
       // lab_2_5_3();
                        /* Дані однакові тому, що змінна arr в  класі Myinit є статичною, відповідно спільною для усіх обєктів.
                        lab_2_5_5();  пропонується блок ініціалізації зробити статичним, в такому випадку змінна  arr буде
                        заповненна даними в момент запуску програми*/

        lab_2_5_5();

    }

    static void lab_2_5_5(){

        for (int i=0; i<=5; i++){
            InitTest initTest1 =new InitTest();
            System.out.println(initTest1.getId());
        }

    }

    static void lab_2_5_1() {
        new MyInitTest();
    }



    static void lab_2_5_2() {
        brain.lab_2_5.labs.tasks._2_5_2.MyInit myInit1 = new brain.lab_2_5.labs.tasks._2_5_2.MyInit();
        brain.lab_2_5.labs.tasks._2_5_2.MyInit myInit2 = new brain.lab_2_5.labs.tasks._2_5_2.MyInit();
        myInit1.printArray();

        myInit2.printArray();
    }
    static void lab_2_5_3() {
        brain.lab_2_5.labs.tasks._2_5_3.MyInit myInit1 = new brain.lab_2_5.labs.tasks._2_5_3.MyInit();
        brain.lab_2_5.labs.tasks._2_5_3.MyInit myInit2 = new brain.lab_2_5.labs.tasks._2_5_3.MyInit();
        myInit1.printArray();

        myInit2.printArray();
    }
}

