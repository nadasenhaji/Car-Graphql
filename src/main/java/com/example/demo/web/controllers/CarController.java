package com.example.demo.web.controllers;
import com.example.demo.dto.CarDTO;
import com.example.demo.services.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class CarController {

    @Autowired
    private CarService carService ;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO voiture) {
        return carService.saveCar(voiture);
    }



    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }

}