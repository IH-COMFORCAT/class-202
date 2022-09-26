package com.ironhack;

import java.util.List;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    List<InvoiceItem> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
