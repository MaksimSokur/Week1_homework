package com.company.MAX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int startWork = 9;
        final int endWork = 18;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите время: ");
        int time = sc.nextInt();
        if (time >= startWork && time < endWork) {
                    System.out.print("Я на работе");
                } else
                    System.out.print("Я отдыхаю!");
            }
        }

