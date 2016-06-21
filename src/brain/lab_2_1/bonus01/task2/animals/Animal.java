package brain.lab_2_1.bonus01.task2.animals;

/**
 * Created by drimcatcher on 21.06.2016.
 */
public class Animal {
    private String nick;
    private int age;
    private String Kind;

    public Animal(){}
    public Animal(String nick){
        this.nick=nick;
    }
    public Animal(String nick, int age){
        this(nick);
        this.age=age;
    }
    public Animal(String nick, int age, String kind) {
        this(nick, age);
        this.Kind = kind;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }
    public void view (){
        System.out.println(String.format("Nick: %s\nAge: %d\nKind: %s\n", this.getNick(), this.getAge(), this.getKind()));

    }

    @Override
    public String toString(){
        return String.format("Nick: %s\nAge: %d\nKind: %s\n", this.getNick(), this.getAge(), this.getKind());
    }
}
