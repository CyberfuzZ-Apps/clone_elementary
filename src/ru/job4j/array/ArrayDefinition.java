package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер ages[]: " + ages.length);
        System.out.println("Размер surnames[]: " + surnames.length);
        System.out.println("Размер prices[]: " + prices.length);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Evgeny Zaytsev";
        names[2] = "James Hatfield";
        names[3] = "Kurt Cobain";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
