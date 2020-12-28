package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYen = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double BGN = 1;
        double sum = 1;
        double USD = BGN * 1.76;
        double EU = BGN * 1.95;
        chineseYen = 0.15 * USD;
        USD = 0.15 * BGN;
        bitcoins = 1168;
        sum = bitcoins + USD / 1.95;
        commission = commission - 0.5 * commission;
        EU = sum;
        System.out.printf("%.2f",sum);
    }
}


