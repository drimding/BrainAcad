package brain.lab_2_7.com.brainacad.oop.testshapes;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width=width;
        this.height=height;
    }
    @Override
    public double calcArea(){
        return width* height;
    }

    @Override
    public String toString(){
        return String.format("This is %s, color: %s, width=%.2f, height=%.2f\nShape area is: %.2f",
                getClass().getSimpleName(), shapeColor, this.width, this.height, this.calcArea());
    }
}
