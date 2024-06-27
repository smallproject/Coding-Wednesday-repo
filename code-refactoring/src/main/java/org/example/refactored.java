package org.example;

public class refactored {

    public void printInvoice(String customerName, double amount) {
        printHeader();
        printDetails(customerName, amount);
        printFooter();
    }

    private static void printDetails(String customerName, double amount) {
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
    }

    private static void printFooter() {
        printLine("---------");
        printLine("Thank you for your business");
    }

    private static void printHeader() {
        printLine("Invoice");
        printLine("---------");
    }

    private static void printLine(String text) {
        System.out.println(text);
    }
}
