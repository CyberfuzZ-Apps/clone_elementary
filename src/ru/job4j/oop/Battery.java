package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery() {
    }

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery();
        Battery battery2 = new Battery(50);
        Battery battery3 = new Battery(20);
        battery1.exchange(battery2);
        battery2.exchange(battery3);
        System.out.println(battery1.load);
        System.out.println(battery2.load);
    }
}