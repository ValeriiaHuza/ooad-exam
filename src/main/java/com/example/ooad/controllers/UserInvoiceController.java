package com.example.ooad.controllers;

import com.example.ooad.models.Invoice;
import com.example.ooad.models.UserInvoice;
import com.example.ooad.service.InvoiceService;
import com.example.ooad.service.UserInvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userInvoiceController")
public class UserInvoiceController {

    private UserInvoiceService userInvoiceService;

    private InvoiceService invoiceService;

    @GetMapping("/{id}")
    public UserInvoice getUserInvoiceById(@PathVariable String id){
        return userInvoiceService.getUserInvoiceById(id);
    }

    @PostMapping()
    public UserInvoice createUSerInvoice(@RequestBody UserInvoice userInvoice){
        return userInvoiceService.createUserInvoice(userInvoice);
    }

    @PostMapping("/getPaymant")
    public Invoice createInvoice(@RequestBody Invoice invoice){

        return invoiceService.createInvoice(invoice);
    }

    final static int maxNotPaid = 2;

    @PostMapping("/getPaymantAgain")
    public Invoice tryCreateInvoice(@RequestBody Invoice invoice){

        List <Invoice> is = invoiceService.findAllInvoices();

        int countNotPaid = 0;

        for (Invoice i : is){
            if (invoice.getUserInvoiceId() == i.getUserInvoiceId()){
                if (!i.isPaid()){
                    countNotPaid++;
                }
            }
        }

        if (countNotPaid == maxNotPaid){
            //ban service
            return null;
        }

        return invoiceService.createInvoice(invoice);
    }

    //if date is the same as in user invoice - create invoice

}
