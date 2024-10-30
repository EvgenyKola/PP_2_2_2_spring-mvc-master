package web.cars;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CService implements CarsGet{


    public List<Cars> getCars(List<Cars> car, int num) {
        if (num <= 0 || num > car.size()) {
            return car;
        }
        return car.subList(0, num);
    }

}
