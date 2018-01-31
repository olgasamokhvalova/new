package ru.sbt.samochvalova.people;

/**
 * Created by SBT-Samokhvalova-OV on 26.01.2018.
 */
public class Person {
    // 1. private
    private String FIO;
    // 2. protected
    protected String firstName;
    // 3. public
    public boolean gender;
    // 4. default
    String secondName;

    private Integer age;

    public Person() {
        this(0);
    }

    public Person(Integer age) {
        this(age, "Иванов И. И.");
    }

    public Person(Integer age, String FIO) {
        this.age = age;
        this.FIO = FIO;
    }

    public Integer getAge() {
        return age;
    }

    public void thinking(int age) {
        System.out.println("My age is: " + this.age);
        System.out.println("World is complex");
    }

}
