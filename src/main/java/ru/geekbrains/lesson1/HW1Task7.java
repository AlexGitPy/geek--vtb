package ru.geekbrains.lesson1;

import java.util.Arrays;

public class HW1Task7 {

    public static void main(String[] args) {

        int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i : intArr) {
            if (intArr[i] < 6) {
                intArr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(intArr));

    }

}
