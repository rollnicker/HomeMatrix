package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Сколько строк: ");
                int size = input.nextInt();
                System.out.println("Сколько стобцов: ");
                int size2 = input.nextInt();
                int matrix[][] = new int[size] [size2];
                System.out.println("Введите числа в матрицу: ");

                for (int i = 0; i <size; i++) {
                    for (int j = 0; j < size2; j++) {
                        matrix[i][j] = input.nextInt();
                    }
                    System.out.println();
                }
                    System.out.println("Если числа первой строки умножить на 3 то получится:  ");
                    for (int i = size-1;i < size; i++) {
                        for (int j = 0; j< size2 ; j++) {
                            System.out.println(matrix[0][j]*3+" ");
                        }
                }
            }
        }