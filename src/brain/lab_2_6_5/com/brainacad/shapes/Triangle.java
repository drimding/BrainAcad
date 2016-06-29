package brain.lab_2_6_5.com.brainacad.shapes;

/**
 * Created by drimcatcher on 28.06.2016.
 */
import static java.lang.Math.*;

public class Triangle {
    private double a;
    private double b = 1.0;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double s = (a+b+c)/2;

        return sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
