package hw_7.task1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {

    private List<T> warehouse;

    public Warehouse() {
        this.warehouse = new ArrayList<>();
    }

    public void addItem(T item){
        warehouse.add(item);
    }
    public int getItemCount(){
        return warehouse.size();
    }

    public List<T> retrieveAll(){
        List<T> warehouseClone = new ArrayList<>();
        warehouseClone.addAll(warehouse);
        warehouse.clear();
        return  warehouseClone;
    }

    public List<T> viewItems(){
        List<T> warehouseClon = new ArrayList<>();
        warehouseClon.addAll(warehouse);
        return  warehouseClon;
    }

    public boolean isEmpty(){
        return warehouse.isEmpty();
    }

    public void clear(){
        warehouse.clear();
    }

}
