package brain.lab_2_17.task_03;

/**
 * Created by drimcatcher on 16.07.2016.
 */
public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private int resultSum;

    @Override
    public void run(){
        if (array!=null && array.length>=startIndex && array.length<=startIndex){

        }
    }

    public int getResultSum() {
        return resultSum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
