package org.example;

import java.util.Scanner;

public class Main {
    public static void matrix()
    {
        Scanner number = new Scanner(System.in);
        int a= number.nextInt();

        for (int i =0;i<a;i++)
        {
            for (int j =0;j<a;j++)
            {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    matrix();
    }
}