package com.example.ooad.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CardInfo {
    private long cardName;
    private String cardDate;
    private int cardCVV;
}
