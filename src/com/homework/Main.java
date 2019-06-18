package com.homework;

import java.util.Arrays;

public class Main {
    /*
    5) Поменять элементы массива следующим образом: первый и последний, второй слева и второй справа итд.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(arr));

        int var = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            var = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = var;
        }

        System.out.println(Arrays.toString(arr));
    }
}
