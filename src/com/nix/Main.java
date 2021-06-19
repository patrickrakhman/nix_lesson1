package com.nix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      fibonachi();
      fizzBuzzRightLeft();
      fizzBuzzLeftRight();
      countOfBits();
    }

    public static void fibonachi() {
        System.out.println("Fibonachi");
        int a = 1;
        int b = 1;
        int c;
        for (int i = 0; i <= 10; i++) {
            c = a + b;
            b = a;
            a = c;
            System.out.println(c);
        }
    }


    public static void fizzBuzzRightLeft() {
        System.out.println("fizzBuzzRightLeft");
        int number = 347693485;
        while (number > 0) {
            int element = number % 10;
            if (element % 3 == 0 && element % 2 == 0) {
                System.out.println("fizzbuzz" + " " + element);
            } else if (element % 3 == 0) {
                System.out.println("buzz" + " " + element);
            } else if (element % 2 == 0) {
                System.out.println("fizz" + " " + element);
            }
            number = number / 10;
        }
    }

    public static void fizzBuzzLeftRight() {
        System.out.println("fizzBuzzLeftRight");
        String value = String.valueOf(347693485);
        double numberLength = value.length();
        double number = Double.valueOf(value);
        for (int i = 0; numberLength > i; numberLength--) {
            double result = number / (Math.pow(10, numberLength - 1));

            int element = (int) (result % 10);

            if (element % 3 == 0 && element % 2 == 0) {
                System.out.println("fizzbuzz" + " " + element);
            } else if (element % 3 == 0) {
                System.out.println("buzz" + " " + element);
            } else if (element % 2 == 0) {
                System.out.println("fizz" + " " + element);
            }
        }
    }

    public static void countOfBits() {
        System.out.println("countOfBits");
        Scanner text = new Scanner(System.in);
        System.out.println("Enter number: ");
        Long number = text.nextLong();
        int counter = 0;
        System.out.println("Number binary: " + Long.toBinaryString(number));
        while (number > 0) {
            if ((number & 1) == 1) {
                counter++;
            }
            number = number >> 1;
        }
        System.out.println("Count of '1' in number is: " + counter);
    }
}



