package javapoo.menu1;

import java.util.Scanner;

public class Algoritmo1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("the next number is:  "+addNextNumber());
        askedThreeNumbers();
        askHightAndWith();
        showNumber();
    }

    public static int suma() {
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        return a;
    }

    public static int addNextNumber() {
        int nextNumber = suma() + 1;
        return nextNumber;
    }

    public static void askedThreeNumbers() {
        System.out.println("Enter first number");
        double a = scanner.nextInt();
        System.out.println("Enter second number");
        double b = scanner.nextInt();
        System.out.println("Enter third number");
        double c = scanner.nextInt();
        System.out.println("average is: " + calculateAvarage(a, b, c));

    }

    public static double calculateAvarage(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static void askHightAndWith() {
        System.out.println("Enter hight: ");
        double hight = scanner.nextDouble();
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        calculatePerimeterArea(hight, width);
    }

    public static void calculatePerimeterArea(double height, double width) {
        double perimeter = 2 * (height + width);
        double area = height * width;
        System.out.println("perimeter is: " + perimeter);
        System.out.println("area is: " + area);
    }

    public static void showNumber() {
        double numberGenerated = (double) generateRandomNumber();
        double result =numberGenerated *0.30;
        double sum = numberGenerated +result;
        System.out.println("Number  generated is:  "+numberGenerated);
        System.out.println("result is: " + result);
        System.out.println("Number  generated is: " +sum);

    }

    public static int generateRandomNumber() {
        int randomNumber = (int) (Math.random() * 10+1);
        return randomNumber;
    }

}

