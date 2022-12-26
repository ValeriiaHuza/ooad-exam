package com.example.ooad.repositories;

import com.example.ooad.models.Tariff;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepository {

    Tariff addTariff(Tariff t);
    Tariff getTariff(String id);

}
