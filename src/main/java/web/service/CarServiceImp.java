package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("2106", "Иванов", 350));
        carList.add(new Car("BMW", "Петров", 4250));
        carList.add(new Car("Niva", "Сидоров", 870));
        carList.add(new Car("Mercedes-Benz", "Иванов", 4625));
        carList.add(new Car("Lotus", "-", 50));
    }

    @Override
    public List<Car> showCars(int count) {
        return carList.stream()
                        .limit(count)
                        .collect(Collectors.toList());
    }
}
