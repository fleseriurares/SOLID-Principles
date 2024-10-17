package com.solid.d.good;

import com.solid.i.Invoice;

public class HtmlInvoicePrinter implements InvoicePrinter{
    @Override
    public void print(Invoice invoice) {
        System.out.println("Html invoice printer:) -- " + invoice.toString());
    }
}
