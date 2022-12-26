package com.example.ooad.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
public class UserInvoice {

    private String id;
    private Tariff tariff;
    private User user;
    //one year, month
    private String period;
    //automatic, manual
    private String payment;
    private String bankCard;
    private Date startDate;

    public UserInvoice(String id, Tariff tariff, User user, String period, String payment, String bankCard) {
        this.id = id;
        this.tariff = tariff;
        this.user = user;
        this.period = period;
        this.payment = payment;
        this.bankCard = bankCard;
        this.startDate = Calendar.getInstance().getTime();
    }

    public UserInvoice(String id, Tariff tariff, User user, String period, String payment) {
        this.id = id;
        this.tariff = tariff;
        this.user = user;
        this.period = period;
        this.payment = payment;
        this.startDate = Calendar.getInstance().getTime();
    }
}
