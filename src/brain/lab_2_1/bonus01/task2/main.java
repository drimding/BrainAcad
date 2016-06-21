package brain.lab_2_1.bonus01.task2;

import brain.lab_2_1.bonus01.task2.animals.Animal;

import java.util.Scanner;

/**
 * Created by drimcatcher on 21.06.2016.
 */
public class main {
    public static void main (String[] argn){
       // task1and2();

        showArrayAnimals(createAnimals());


    }

    public static void task1and2(){
        Animal cat = new Animal("Vaska", 2, "Cats");
        System.out.println(cat);

        Animal dog = initialize("Barsic", 4, "Dogs");
        Animal tiger = initialize("Sharkan", 8, "Tigers");

        dog.view();
        tiger.view();
    }
    public static Animal[] createAnimals(){
        Animal[] animals;
        Scanner scanner = new Scanner(System.in);
        System.out.print("countAnimals: ");
        animals = new Animal[scanner.nextInt()];
        for (int i=0; i<animals.length; i++){
           animals[i]=initialize(setConsoleNick(), setConsoleAge(), setConsoleKind());
        }
        return animals;
    }

   public static void showArrayAnimals (Animal[] animals){
       for (Animal animal: animals) {
           animal.view();
       }
   }

   public static String setConsoleNick () {
       System.out.print("Nick: ");
       return new Scanner(System.in).nextLine();
   }
    public static int setConsoleAge(){
        System.out.print("age: ");
        return new Scanner(System.in).nextInt();
    }
    public static String setConsoleKind(){
        System.out.print("Kind: ");
        return  new Scanner(System.in).nextLine();
    }
   public static Animal initialize(String nick, int age, String kind){
        Animal animal = new Animal();
        animal.setNick(nick);
        animal.setAge(age);
        animal.setKind(kind);
        return animal;
    }

}
