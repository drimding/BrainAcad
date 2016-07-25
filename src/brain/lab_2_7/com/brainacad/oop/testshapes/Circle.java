package brain.lab_2_7.com.brainacad.oop.testshapes;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius=radius;
    }

    @Override
    public double calcArea(){
        return 3.1415926*(radius*radius);
    }

    @Override
    public String toString(){
        return String.format("This is %s, color: %s, radius=%.0f\nShape area is: %.5f",
                getClass().getSimpleName(), shapeColor, this.radius, this.calcArea());
    }

}
