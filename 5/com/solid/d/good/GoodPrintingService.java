package com.solid.d.good;

import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter;

public class GoodPrintingService {
    InvoicePrinter invoicePrinter;

    public GoodPrintingService(InvoicePrinter invoicePrinter)
    {
        this.invoicePrinter = invoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}
