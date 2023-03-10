package com.example.ooad.service;

import com.example.ooad.models.Invoice;
import com.example.ooad.models.User;
import com.example.ooad.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    InvoiceRepository invoiceRepository;


    public Invoice createInvoice(Invoice invoice){
        return invoiceRepository.addInvoice(invoice);
    }

    public Invoice getInvoiceById(String invoiceId){
        return invoiceRepository.getInvoice(invoiceId);
    }

    public List<Invoice> findAllInvoices(){
        return invoiceRepository.findAll();
    }

}
