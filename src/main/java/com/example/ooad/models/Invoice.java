package com.example.ooad.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Invoice {
    private String invoiceID;
    private Date invoiceDate;
    private String userInvoiceId;
    private boolean isPaid;
}
