package brain.lab_2_4.labs.tasks;


import brain.lab_2_4.labs.tasks._2_4_1.MyMath;
import brain.lab_2_4.labs.tasks._2_4_4.Emploee;

/**
 * Created by drimcatcher on 25.06.2016.
 */
public interface StaticClassMembers {
    static void demo(){
        //lab_2_4_1();
        lab_2_4_3();
        lab_2_4_4();

    }

    static void lab_2_4_4(){
        new Emploee("Petrik", "Pyatochkin", "Razpidyay", "102");
        new Emploee("Petrik", "Pyatochkin", "Razpidyay", "102");
        new Emploee("Petrik", "Pyatochkin", "Razpidyay", "102");
        System.out.printf("Number of employees is %d\n", Emploee.getNumberOfEmployees());
    }

    static void lab_2_4_3(){
        System.out.printf("Area of circle is %f\n", MyMath.areaOfCircle(5.2));
    }
    static void lab_2_4_1(){
        int[] array1 = {1,2,5,3,2,6};
        int[] array2 = {4,5,6,7,8,1};
        int array1Max = MyMath.findMax(array1);
        int array1Min = MyMath.findMin(array1);

        int array2Max = MyMath.findMax(array2);
        int array2Min = MyMath.findMin(array2);

        System.out.printf("Number of Max values in first arra is %d\n" +
                "Number of Min values in first arra is %d\n" +
                "Number of Max values in second arra is %d\n" +
                "Number of Min values in second arra is %d\n",
                array1Max, array1Min, array2Max, array2Min);
    }




}

