package com.example.demo.services.mappers;

import com.example.demo.dao.entity.Car;
import com.example.demo.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();


    public Car fromCarDtoToCar(CarDTO carDto) {
        return mapper.map(carDto, Car.class);  // Using ModelMapper for automatic mapping
    }


    public CarDTO fromCarToCarDto(Car car) {
        return mapper.map(car, CarDTO.class);  // Using ModelMapper for automatic mapping
    }
}
