package brain.lab_2_7.bonus01.inheritance.workers;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class QA extends Worker{
    private final String king;

    public QA (final String name, final long ID, String king){
        super(name, ID);
        this.king=king;
    }


    @Override
    public String toString() {
        return super.toString()+"King:"+king;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        QA qa = (QA) o;

        return king != null ? king.equals(qa.king) : qa.king == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (king != null ? king.hashCode() : 0);
        return result;
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" eat cook and tea");
    }
}
