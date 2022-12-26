package com.example.ooad.repositories;

import com.example.ooad.models.UserInvoice;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInvoiceRepository {

    UserInvoice addUserInvoice(UserInvoice i);
    UserInvoice getUserInvoice(String id);

}
