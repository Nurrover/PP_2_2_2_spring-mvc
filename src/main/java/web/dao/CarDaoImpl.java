package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "Priora", 400000));
        cars.add(new Car("Mercedes-Benz", "AMG GT", 8000000));
        cars.add(new Car("Mazda", "3", 2000000));
        cars.add(new Car("Nissan", "Almera", 700000));
        cars.add(new Car("Mitsubishi", "Lancer", 730000));
    }

    @Override
    public List<Car> getCars(int count) {
        count = Math.min(count, 5);
        return cars.stream().limit(count).toList();
    }
}
