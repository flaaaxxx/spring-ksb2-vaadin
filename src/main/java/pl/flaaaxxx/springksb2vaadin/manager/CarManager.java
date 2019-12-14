package pl.flaaaxxx.springksb2vaadin.manager;

import org.springframework.stereotype.Service;
import pl.flaaaxxx.springksb2vaadin.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    List<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();
        carList.add(new Car("Fiat", "126p"));
        carList.add(new Car("BMW", "I8"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void addCar(Car car){
        carList.add(car);
    }
}
