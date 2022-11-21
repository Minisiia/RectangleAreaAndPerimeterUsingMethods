package RectanglePack;

public class Rectangle {
    private double side1;
    private double side2;

    static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

}
