package com.javarush.task.level05.task0506;

class Person {

    String name;
    int age;
    String address;
    char sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Person(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;

    }
}

public class Main {


    public static void main(String[] args) {
        Person egor = new Person("Egor", 27, "kolomenskay", 'M');
        System.out.println(egor);
    }
}

