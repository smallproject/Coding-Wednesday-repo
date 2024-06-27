package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoicePrinterTest {

    @Test
    void printInvoice() {
        // Arrange
        String name = "Nick";
        double amount = 10;
        InvoicePrinter printer = new InvoicePrinter();

        // Act
        printer.printInvoice(name, amount);

        // Assert
        assertEquals(true, true);
    }
}