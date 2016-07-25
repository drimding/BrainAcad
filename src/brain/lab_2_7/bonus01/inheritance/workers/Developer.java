package brain.lab_2_7.bonus01.inheritance.workers;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class Developer extends Worker {
    private final String profile;

    public Developer (final String name, final long ID, String profile){
        super(name, ID);
        this.profile=profile;
    }

    @Override
    public String toString() {
        return super.toString()+"Profile:"+profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Developer developer = (Developer) o;

        return profile != null ? profile.equals(developer.profile) : developer.profile == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        return result;
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" eat Pizza and coffe");
    }
}
