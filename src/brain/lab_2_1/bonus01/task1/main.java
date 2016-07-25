package brain.lab_2_1.bonus01.task1;

/**
 * Created by drimcatcher on 21.06.2016.
 */
public class main {
    public static void main (String[] args){
        Person[] perosns = arrayPersons();
        for (Person person: perosns) {
            System.out.println(person);

        }


    }
    public static void task1and2(){
        Person mykola = new Person();
        mykola.setName("Mykola");
        mykola.setAge(25);
        mykola.setTaxID(76548754687453435L);

        System.out.println(mykola);
    }

    public static Person[] arrayPersons(){
        String[] names ={"Mykola", "Roma", "Vitaliy", "Kostia", "Oleg"};
        int[] ages ={25, 30,32,27,22};
        long[] taxesID={6545646546L, 54532432L, 5246534321L, 3231212L, 87545L};
        Person[] p = new Person[5];
        for (int i=0; i<p.length; i++){
            p[i]=new Person(names[i], taxesID[i], ages[i]);
        }
        return p;
    }
}
