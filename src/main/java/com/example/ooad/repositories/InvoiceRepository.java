package com.example.ooad.repositories;

import com.example.ooad.models.Invoice;

public interface InvoiceRepository {

    Invoice addInvoice(Invoice i);
    Invoice getInvoice(String id);

}
