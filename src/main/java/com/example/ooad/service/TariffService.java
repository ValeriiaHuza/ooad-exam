package com.example.ooad.service;

import com.example.ooad.models.Invoice;
import com.example.ooad.models.Tariff;
import com.example.ooad.repositories.TariffRepository;
import org.springframework.stereotype.Service;

@Service
public class TariffService {

    TariffRepository tariffRepository;


    public Tariff createTariff(Tariff tariff){
        return tariffRepository.addTariff(tariff);
    }

    public Tariff getTariffById(String invoiceid){
        return tariffRepository.getTariff(invoiceid);
    }

}
