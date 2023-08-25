package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] arrayFirst = new int[size];
        int[] arrayFirst1 = {1,2,3,4,5,6};

        for(int index = 0; index < arrayFirst1.length; index++){
            System.out.println(arrayFirst1[index]);
        }
        System.out.println();

        for(int current: arrayFirst1){
            System.out.println(current);
        }

        System.out.println();

        System.out.println(Arrays.toString(arrayFirst1));


        Random rand = new Random();

        for(int number = 0; number < arrayFirst.length; number++){
            arrayFirst[number] = rand.nextInt(40);
        }
        System.out.println(Arrays.toString(arrayFirst));

        int[][] matrix = new int[5][3];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ; ");
            }
            System.out.print("\b\b\b");
            System.out.println();
        }

        int[][] matrix1 = {{1,2,3,4,5}, {6,7,8}, {8,9,1,2}};

        System.out.println("123");

    }
}
