package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multi = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multi[i][j] = (i + 1) * (j + 1);
            }
        }
        return multi;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiple(9)));
    }
}
