package com.example.ooad.controllers;

import com.example.ooad.models.Tariff;
import com.example.ooad.models.User;
import com.example.ooad.service.TariffService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tariff")
public class TariffController {
    private TariffService tariffService;

    @GetMapping("/{id}")
    public Tariff getTariffById(@PathVariable String id){
        return tariffService.getTariffById(id);
    }

    @PostMapping()
    public Tariff createTariff(@RequestBody Tariff tariff){
        return tariffService.createTariff(tariff);
    }
}
