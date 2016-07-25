package brain.lab_2_13.task_All;

import brain.lab_2_13.task_04.Card;
import brain.lab_2_13.task_04.Rank;
import brain.lab_2_13.task_04.Suit;

import java.util.Scanner;

import static brain.lab_2_13.task_All.main.MyDayOfWeek.*;

/**
 * Created by drimcatcher on 12.07.2016.
 */
public class main {
    enum MyDayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public static MyDayOfWeek nextDay(MyDayOfWeek current){
            if(current.ordinal() == current.values().length - 1)
                return MyDayOfWeek.values()[0];
            else
                return MyDayOfWeek.values()[current.ordinal() + 1];
        }
    }



    public static void main(String[]args){
        //task_01 ();
        //tasks(TUESDAY, THURSDAY, SATURDAY);
        //task_03();
          task_04();
        }


    public static void task_01 (){
        for (MyDayOfWeek day : values()) {
            System.out.println(day);
        }
    }

    public static void task_02(MyDayOfWeek... days){
        for (MyDayOfWeek day: days) {
         switch (day){
             case MONDAY: {
                 System.out.printf("My Java day: %s\n", MONDAY);
                 break;
             }
             case TUESDAY: {
                 System.out.printf("My Java day: %s\n", TUESDAY);
                 break;
             }
             case WEDNESDAY: {
                 System.out.printf("My Java day: %s\n", WEDNESDAY);
                 break;
             }
             case THURSDAY: {
                 System.out.printf("My Java day: %s\n", THURSDAY);
                 break;
             }
             case FRIDAY: {
                 System.out.printf("My Java day: %s\n", FRIDAY);
                 break;
             }
             case SATURDAY: {
                 System.out.printf("My Java day: %s\n", SATURDAY);
                 break;
             }
             case SUNDAY: {
                 System.out.printf("My Java day: %s\n", SUNDAY);
                 break;
             }

         }
      }
    }
    public static void task_03(){
        Scanner scaner = new Scanner(System.in);
       try{
        String day = scaner.nextLine();
       System.out.printf("The next day of week: %s\n", MyDayOfWeek.nextDay(MyDayOfWeek.valueOf(day.toUpperCase())));
       }catch (Exception e){
           System.out.println("Incorrect value passed!");
       }finally {
           scaner.close();
       }
    }

    public static void task_04(){
        Card[] cards = new Card[52];
        int cout = 0;
        for (int i = 0 ; i< Suit.values().length; i++){
            for (int j = 0; j< Rank.values().length; j++){
              cards[cout]= new Card(Suit.values()[i], Rank.values()[j]);
              cout++;
            }
        }
        Suit categ = cards[0].getCardSuit();
        System.out.printf("\nCard category is: %s\n", categ);
        for (int i=0;  i<cards.length; i++ ) {
            if (categ !=cards[i].getCardSuit()) {
                System.out.printf("\nCard category is: %s\n", cards[i].getCardSuit());
                categ =cards[i].getCardSuit();
            }
            System.out.println(cards[i]);
        }
    }
}
