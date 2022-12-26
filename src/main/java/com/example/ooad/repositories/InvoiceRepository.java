package com.example.ooad.repositories;

import com.example.ooad.models.Invoice;

import java.util.List;

public interface InvoiceRepository{

    Invoice addInvoice(Invoice i);
    Invoice getInvoice(String id);

    List <Invoice> findAll();

}
