package hw_9.task2;

public class Main {

    public static void main(String[] args) {


        Vehicle car1 = Vehicle.getInstance("bmw", 200, 1200);
        Vehicle car2 = Vehicle.getInstance("mercedes", 150, 23552);
        Vehicle car3 = Vehicle.getInstance("volvo", 140, 11333);
        Vehicle car4 = Vehicle.getInstance("audi", 300, 35333);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
