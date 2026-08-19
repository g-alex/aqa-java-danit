package hw_11.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Person vasia = new Person("Vasia", "Vlasov",25, 5000);
        Person petya = new Person("Petro","Loik",80,7500);
        Person masha = new Person("Maria", "Voitek",22,12000);
        Person ira = new Person("Irina","Solovei",40,4200);
        Person vova = new Person("Volodymyr","Gagarin",73,21000);

        List<Person> peoples = new ArrayList<>();

        peoples.add(vasia);
        peoples.add(petya);
        peoples.add(masha);
        peoples.add(ira);
        peoples.add(vova);

        System.out.println(peoples);

        List<String> newList =  peoples.stream()
                .filter(person -> person.getAge() < 70)
                .map(person -> person.getName())
                .toList();

        System.out.println(newList);
    }
}
