package com.javarush.task.level05.task0505;

import java.lang.Integer;


public class Solution {
    public static void main(String args[]) {

        Cat murzik = new Cat("Мурзик", 3, 4, 145);
        Cat samson = new Cat("Самсон", 4, 8, 98);
        Cat markiz = new Cat("Маркиз", 11, 6, 153);

        System.out.println(murzik.fight(samson));
        System.out.println(murzik.fight(markiz));
        System.out.println(markiz.fight(samson));



    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strenght;

        public Cat(String name, int age, int weight, int strenght) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strenght = strenght;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.age);
            int strenghtScore = Integer.compare(this.strenght, anotherCat.strenght);

            int score = ageScore + weightScore + strenghtScore;
            return score > 0;
        }
    }
}
