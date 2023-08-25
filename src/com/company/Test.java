package com.company;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //System.out.println("Test string");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        System.out.println(inputString);

        int intValue;
        int intValue1;

        intValue = scanner.nextInt();
        System.out.println(intValue);

        intValue1 = scanner.nextInt();
        System.out.println(intValue1);

        String inputStringSecond = scanner.nextLine();
        inputStringSecond = scanner.nextLine();
        System.out.println(inputStringSecond);

    }
}
