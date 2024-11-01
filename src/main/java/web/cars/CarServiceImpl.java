package web.cars;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    public List <Car> setCars () {
        List <Car> cars = new LinkedList<>();
        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Acura", "TLX", 2020));
        cars.add(new Car("Honda", "Accord", 2019));
        cars.add(new Car("BMX", "X3", 2020));
        cars.add(new Car("Lada", "Vesta", 2022));
        return cars;
    }

    public List<Car> getCars(List<Car> car, int num) {
        if (num <= 0 || num > car.size()) {
            return car;
        }
        return car.subList(0, num);
    }

}
