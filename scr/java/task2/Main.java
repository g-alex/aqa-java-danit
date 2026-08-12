package task2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle("BMW", 300, 15000, 4);
        Vehicle audi = null;

        System.out.println(Optional.ofNullable(bmw).isPresent());
        System.out.println(Optional.ofNullable(bmw).isEmpty());

        Optional.ofNullable(bmw).ifPresent(x -> System.out.println("The list is: " + x));
        Optional.ofNullable(bmw).ifPresentOrElse(
                x -> System.out.println("The list is: " + x),
                () -> System.out.println("The list is empty")
        );

        Vehicle check = Optional.ofNullable(bmw).orElse(new Vehicle("Buick", 150, 11000, 4));
        System.out.println(check);

        Vehicle check_2 = Optional.ofNullable(bmw).orElseGet(() -> new Vehicle("Buick", 150, 11000, 4));
        System.out.println(check_2);

        Vehicle check_3 = Optional.ofNullable(bmw).orElseThrow(() -> new IllegalStateException("List is empty"));
        System.out.println(check_3);

        System.out.println(Optional.ofNullable(audi).isPresent());
        System.out.println(Optional.ofNullable(audi).isEmpty());

        Optional.ofNullable(audi).ifPresent(x -> System.out.println("The list is: " + x));
        Optional.ofNullable(audi).ifPresentOrElse(
                x -> System.out.println("The list is: " + x),
                () -> System.out.println("The list is empty")
        );

        Vehicle check_4 = Optional.ofNullable(audi).orElse(new Vehicle("Buick", 150, 11000, 4));
        System.out.println(check_4);

        Vehicle check_5 = Optional.ofNullable(audi).orElseGet(() -> new Vehicle("Buick", 150, 11000, 4));
        System.out.println(check_5);

        Vehicle check_6 = Optional.ofNullable(audi).orElseThrow(() -> new IllegalStateException("List is empty"));
        System.out.println(check_6);

    }

}
