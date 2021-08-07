package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GoldWallet card1 = new GoldWallet(859.60);
        PlatinumWallet card2 = new PlatinumWallet(1693.84);
        System.out.println("Insert the amount of transfer:");
        double amount = sc.nextDouble();
        TransactionUtil.executeTransaction(card1, card2, amount);
    }
}
