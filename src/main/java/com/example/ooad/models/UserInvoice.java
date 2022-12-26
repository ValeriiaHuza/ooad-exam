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
    private String tariffId;
    private String userId;
    //one year, month
    private String period;
    //automatic, manual
    private String payment;
    private CardInfo bankCard;
    private Date startDate;

    public UserInvoice(String id, String tariff, String user, String period, String payment, CardInfo bankCard) {
        this.id = id;
        this.tariffId = tariff;
        this.userId = user;
        this.period = period;
        this.payment = payment;
        this.bankCard = bankCard;
        this.startDate = Calendar.getInstance().getTime();
    }

    public UserInvoice(String id, String tariff, String user, String period, String payment) {
        this.id = id;
        this.tariffId = tariff;
        this.userId = user;
        this.period = period;
        this.payment = payment;
        this.startDate = Calendar.getInstance().getTime();
    }
}
