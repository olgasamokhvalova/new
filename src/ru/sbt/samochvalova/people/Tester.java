package ru.sbt.samochvalova.people;

/**
 * Created by SBT-Samokhvalova-OV on 26.01.2018.
 */
public class Tester {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());

        Child child = new Child();

        person.thinking();
        child.thinking();
        child.thinking(5);
        child.thinking("My thought");
    }
}
