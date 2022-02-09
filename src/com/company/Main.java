package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        System.out.println("Menu.");
        System.out.println("1. Chuyển từ độ C sang độ F");
        System.out.println("2. Chuyển từ độ F sang độ C");
        System.out.println("0. Exit");
        System.out.println("Lựa chọn của bạn: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Nhập độ F: ");
                doF = scanner.nextDouble();
                System.out.println("Độ C = " + FtoC(doF));
                break;
            }
            case 2: {
                System.out.println("Nhập độ C:");
                doC = scanner.nextDouble();
                System.out.println("Độ F = " + CtoF(doC));
                break;
            }
            case 0:
                System.exit(0);
        }
        while (choice != 0);
    }

    public static double CtoF(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double FtoC(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}


