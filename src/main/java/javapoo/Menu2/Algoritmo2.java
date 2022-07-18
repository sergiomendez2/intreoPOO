package javapoo.Menu2;

import java.util.Scanner;

public class Algoritmo2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        askTwoNumbers();
        sumNumberAllDigits();
        checkCapicua();
    }

    public static void evaluateNumber(int number1, int number2) {
        if (number1  % number2 == 0) {
            System.out.println("both numbers can be divide by each other");
        } else {
            System.out.println("not divide each other");
        }
    }

    public static void askTwoNumbers() {
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        evaluateNumber(number1, number2);
    }



    public static void sumNumberAllDigits() {
        System.out.println("enter a number should be from 1 to 4 digits at least");
        int number = scanner.nextInt();
        int digit = Integer.toString(number).length();
        int sum = 0;
        if (digit >= 1 && digit <= 4) {
            for (int i = 0; i < digit; i++) {
                String sumNumbers = String.valueOf(Integer.valueOf(number).toString().charAt(i));
                sum += Integer.parseInt(sumNumbers);
            }
            System.out.println("sum of all digits is: " + sum);
        }else{
            System.out.println("invalid number");
        }

    }

    public static void checkCapicua() {
        System.out.println("enter a number should be 5 digits");
        int number = scanner.nextInt();
        int number1 = number;
        int number2Inverted = 0;
        while (number1 > 0) {
            int remainder = number1 % 10;
            number2Inverted = number2Inverted * 10 + remainder;
            number1 = number1 / 10;
        }
        if (number == number2Inverted) {
            System.out.println("number is capicua");
        } else {
            System.out.println("number is not capicua");
        }
    }

}
