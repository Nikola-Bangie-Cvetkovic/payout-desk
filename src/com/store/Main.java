package com.store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Card bronzeCard = new BronzeCard("John Do", 0);
        Card silverCard = new SilverCard("John Do", 600);
        Card goldCard = new GoldCard("John Do", 1500);

        System.out.println("\tBRONZE");
        PayDesk.printPurchaseInfo(bronzeCard, 150);
        System.out.println("\tSILVER");
        PayDesk.printPurchaseInfo(silverCard, 850);
        System.out.println("\tGOLD");
        PayDesk.printPurchaseInfo(goldCard, 1300);

        waitBeforeExit();
    }

    private static void waitBeforeExit() {
        Scanner wait = new Scanner(System.in);
        System.out.println("Press any key to exit...");
        wait.nextLine();
    }
}