package ru.geekbrains.lesson1;

public class HW1Task2 {

    public static void main(String[] args) {
        positiveOrNegative(0);
    }

    public static void positiveOrNegative(int intValue) {
        if (intValue >= 0) {
            System.out.println("Positive number");
        } else
            System.out.println("Negative number");
    }

}
