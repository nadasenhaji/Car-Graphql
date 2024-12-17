package com.example.demo.services.manager;

import com.example.demo.dto.CarDTO;

import java.util.List;

public interface CarManager {

    public CarDTO saveCar(CarDTO carDTO);

    public List<CarDTO> getCarByModel(String model);

}
