package brain.lab_2_5.labs.tasks._2_5_5;

/**
 * Created by drimcatcher on 28.06.2016.
 */
public class InitTest {
    private int id;
    private static int nextId;

    static
    {
        nextId = (int) (1 + (Math.random() * (1000 - 1)));
    }

    {
        nextId = (int) (1 + (Math.random() * (1000 - 1)));
        id=nextId;
    }

    public int getId() {
        return id;
    }
}
