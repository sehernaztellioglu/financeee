package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Main {


    static int toplamBalance = 0;
    static int balance = 0;
    static int[] incomes = new int[100];
    static int[] expenses = new int[100];


    static int toplamExpense = 0;
    static int harcamalar;
    static int sayac = -1;
    static int toplamIncome = 0;

    static int counter = 0;
    static int counter2 = 0;


    static void addingIncome(int valueOfIncome) {
        incomes[counter] = valueOfIncome;
        counter++;
    }

    static void addingExpense(int valueOfIncome) {
        expenses[counter2] = valueOfIncome;
        counter++;
    }


    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add income\n" +
                "2. Add expenses\n" +
                "3. Show balance\n" +
                "4. Show expenses\n" +
                "5. EXIT");





        while (true) {
            int input1 = Integer.parseInt(scanner.nextLine());

            if (input1 == 1) {
                System.out.println("Add income:");
                sayac++;
                int input2 = Integer.parseInt(scanner.nextLine());
                addingIncome(input2);
                System.out.print("income added\n");
                for(int i = 0; i < 100; i++){
                    toplamIncome = incomes[i] + toplamIncome;

                }

            }



            if (input1 == 2) {
                System.out.println("Add expenses:");
                int input2 = Integer.parseInt(scanner.nextLine());

                expenses[counter2] = input2;
                counter2++;
                System.out.print("expense added\n");

                for(int i = 0; i < 100; i++){
                    toplamExpense = expenses[i] + toplamExpense;

                }

            }




            if (input1 == 3) {
                System.out.println("Showing balance");
                int gelir = toplamIncome;
                int gider = toplamExpense;

                int BALANCE = gelir - gider;
                balance = BALANCE;



                System.out.println(balance);

            }



            if (input1 == 4) {
                System.out.println("Showing expenses");
                for (int eleman : expenses) {
                    System.out.println(eleman);


                }

            }



            if (input1 == 5) {
                System.out.println("EXIT");
                break;
            }

            }
        }
    }

