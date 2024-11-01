package web.cars;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService implements CarsGet{

    public List <Cars> setCars () {
        List <Cars> cars = new LinkedList<>();
        cars.add(new Cars("Toyota", "Camry", 2022));
        cars.add(new Cars("Acura", "TLX", 2020));
        cars.add(new Cars("Honda", "Accord", 2019));
        cars.add(new Cars("BMX", "X3", 2020));
        cars.add(new Cars("Lada", "Vesta", 2022));

        return cars;

    }


    public List<Cars> getCars(List<Cars> car, int num) {
        if (num <= 0 || num > car.size()) {
            return car;
        }
        return car.subList(0, num);
    }

}
