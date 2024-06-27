package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class InvoicePrinter {
    private ArrayList<String> textDetail;
    public void printInvoice(String customerName, double amount) {
        System.out.println("Invoice");
        System.out.println("---------");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("---------");
        System.out.println("Thank you for your business!");
    }

    public void printInvoice2(String customerName, double amount) {
        textDetail.add(printDetail("Customer", customerName));
        textDetail.add(printDetail("Amount", amount));
        printConsole(printTemplate(textDetail));
    }

    private void printConsole(String text) {
        System.out.println(text);
    }

    private String printDetail(String text, String value) {
        return "${text}: ${value}";
        //printConsole(textDetail);
    }

    private String printDetail(String text, double value) {
        return text + value;
        //printConsole(textDetail);
    }

    private ArrayList<String> printTemplate(ArrayList<String> textDetails) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Invoice");
        list.add("---------");

        for (String detail:textDetails) {
            list.add(detail);
        }

        list.add("---------");
        list.add("Thank you for your business!");
        return list;
    }

    private void printConsole(ArrayList<String> resultList) {
        for (var line:resultList) {
            printConsole(line);
        }
    }
}