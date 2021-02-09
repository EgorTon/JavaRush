package com.javarush.task.level04.task0436;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}