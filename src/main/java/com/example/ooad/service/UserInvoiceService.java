package com.example.ooad.service;

import com.example.ooad.models.Tariff;
import com.example.ooad.models.UserInvoice;
import com.example.ooad.repositories.UserInvoiceRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInvoiceService {

    UserInvoiceRepository userInvoiceRepository;

    public UserInvoice createUserInvoice(UserInvoice userInvoice){
        return userInvoiceRepository.addUserInvoice(userInvoice);
    }

    public UserInvoice getUserInvoiceById(String invoiceid){
        return userInvoiceRepository.getUserInvoice(invoiceid);
    }
}
