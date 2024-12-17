package com.example.demo.services.service;

import com.example.demo.dao.entity.Car;
import com.example.demo.dao.repository.CarRepository;
import com.example.demo.dto.CarDTO;
import com.example.demo.services.manager.CarManager;
import com.example.demo.services.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarManager {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDto) {

        Car car = carMapper.fromCarDtoToCar(carDto);

        car = carRepository.save(car);

        return carMapper.fromCarToCarDto(car);
    }


    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> voitures = carRepository.findByModel(model);
        List<CarDTO> voitureDtos = new ArrayList<>();
        for (Car voiture : voitures) {
            voitureDtos.add(carMapper.fromCarToCarDto(voiture));
        }
        return voitureDtos;
    }

}
