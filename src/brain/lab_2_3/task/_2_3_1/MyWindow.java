package brain.lab_2_3.task._2_3_1;

/**
 * Created by drimcatcher on 29.06.2016.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(){
        this.width= 150;
        this.height=60;
        this.numberOfGlass = 5;
        this.color = "White";
        this.isOpen = true;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(boolean isOpen, String color, int numberOfGlass) {
        this.isOpen = isOpen;
        this.color = color;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }


    public void printFields() {
        System.out.println( "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}');
    }
}
