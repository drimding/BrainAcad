package brain.lab_2_14.tasks;

/**
 * Created by drimcatcher on 25.07.2016.
 */
public class MyMixer <T> {
    private T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public void shuffle() {

        for (int i = 0; i<arr.length; i++){
            int random = rnd(arr.length-1);
            T temp = arr[i];
            arr[i]=arr[random];
            arr[random]=temp;
        }

        System.out.print("[");
        for (T arrEl : arr) {
            System.out.print(arrEl + " ");
        }
        System.out.println("]");
    }

    private int rnd(int max) {
       return (int) (Math.random() * ++max);
    }
}