package hw_7.task1;

public class Main {

    public static void main(String[] args){
        Warehouse<String> strWarehouse = new Warehouse<>();
        Warehouse<Integer> intWarehouse = new Warehouse<>();

        strWarehouse.addItem("hello");
        strWarehouse.addItem("bue");

        intWarehouse.addItem(123);
        intWarehouse.addItem(6346);

        System.out.println(strWarehouse.getItemCount());
        System.out.println(intWarehouse.getItemCount());

        System.out.println(strWarehouse.viewItems());
        System.out.println(intWarehouse.viewItems());

        System.out.println(strWarehouse.retrieveAll());
        System.out.println(strWarehouse.isEmpty());

        System.out.println(intWarehouse.retrieveAll());
        System.out.println(intWarehouse.isEmpty());

    }
}
