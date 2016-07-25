package brain.lab_2_12.task_05;

/**
 * Created by drimcatcher on 07.07.2016.
 */
public class app {
    public static void main(String[] args){
        MyTestClass.MyStaticNested st = new MyTestClass.MyStaticNested();

        MyTestClass myTestClass = new MyTestClass();
        MyTestClass.MyInner inner= myTestClass.new MyInner();

        st.printOuter();
        inner.printOuter();

        testLocal m = (testLocal) myTestClass.method();
        m.printOuter();


    }
}
