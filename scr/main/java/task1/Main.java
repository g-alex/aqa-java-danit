package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Car bmw = new Car("bmw", 200);
        Car mercedes = new Car("mercedes",100);
        Car audi = new Car("audi",150);
        Car volvo = new Car("volvo", 120);
        Car jeep = new Car("jeep", 80);

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(audi);
        cars.add(volvo);
        cars.add(jeep);
        cars.add(mercedes);

        System.out.println("----------- Before ---------");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println("----------- After ---------");
        System.out.println(cars);
    }
}
