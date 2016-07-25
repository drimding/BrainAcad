package brain.lab_2_16.tasks.task_01;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class main {
    public static void main(String[] args){
        Animal a = new Dog();
        foo(a);
        foo(new Dog());

    }
    public static void foo(Animal o){
        System.out.println("Animal");
    }
    public static void foo(Dog o){
        System.out.println("Dog");
    }
}



