package RectanglePack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину прямокутника:");
        double mySide1 = scanner.nextDouble();
        System.out.println("Введіть ширину прямокутника:");
        double mySide2 = scanner.nextDouble();
        System.out.println("Периметр прямокутника дорівнює - " + Rectangle.perimeterCalculator(mySide1, mySide2));
        System.out.println("Площа прямокутника дорівнює - " + Rectangle.areaCalculator(mySide1, mySide2));
    }
}
