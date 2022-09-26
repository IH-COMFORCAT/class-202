package com.ironhack;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InvoiceItem> invoiceItems = new ArrayList<>();

        InvoiceItem invoiceItem1 = new InvoiceItem("Coca-cola", "1.5");
        InvoiceItem invoiceItem2 = new InvoiceItem("Ginebra", "13");
        InvoiceItem invoiceItem3 = new InvoiceItem("Hielo", "2.0");

        invoiceItems.addAll(List.of(invoiceItem1, invoiceItem2, invoiceItem3));

        Invoice invoice = new Invoice("YMZ-0002", 16.5, false, invoiceItems);

        Gson gson = new Gson();

        System.out.println(gson.toJson(invoice));



    }
}