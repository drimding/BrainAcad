package brain.lab_2_1.bonus01.task1;

/**
 * Created by drimcatcher on 21.06.2016.
 */
public class Person {
    private String name;
    private int age;
    private long taxID;

    public Person(){}

    public Person(String name, long taxID, int age) {
        this.name = name;
        this.taxID = taxID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTaxID() {
        return taxID;
    }

    public void setTaxID(long taxID) {
        this.taxID = taxID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\nTaxation ID: %d\n", this.getName(), this.getAge(), this.getTaxID());
    }

}
