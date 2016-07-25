package brain.lab_2_7.com.brainacad.oop.testshapes;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public  class Shape {
    protected String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea(){
        return 0.0;
    }

    @Override
    public String toString(){
        return String.format("%s, color is: %s\n",getClass().getSimpleName(),shapeColor);
    }

}
