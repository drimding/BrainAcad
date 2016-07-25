package brain.lab_2_7.bonus01.inheritance.workers;

import brain.lab_2_7.bonus01.inheritance.move.Eater;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public abstract class Worker implements Eater {
    private final String name;
    private final long ID;

    public Worker(String name, long ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("%s: %nName: %s\nID: %d\n", getClass().getSimpleName(), name, ID);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (ID != worker.ID) return false;
        return name != null ? name.equals(worker.name) : worker.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (ID ^ (ID >>> 32));
        return result;
    }
}
