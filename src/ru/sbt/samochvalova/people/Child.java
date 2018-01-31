package ru.sbt.samochvalova.people;

/**
 * Created by SBT-Samokhvalova-OV on 26.01.2018.
 */
public class Child extends Person {




    public void init() {

    }

    @Override
    public void thinking() {
        System.out.println("World is Simple");
    }

    public void thinking(int i) {
        System.out.println("I have " + i + " apples");
    }

    public void thinking(String string) {
        System.out.println(string);
    }

    public void thinking(String string, int i) {
        System.out.println(string);
    }
    public void thinking(int a, String b) {

    }


}
