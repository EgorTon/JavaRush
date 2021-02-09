package com.javarush.task.level04.task0437;

public class Main {

    public static void main(String[] args){

        for(int x = 1; x < 11; x++){
            System.out.print(8);
            for(int y = 1; y < x; y ++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}