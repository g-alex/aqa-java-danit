package task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
    Person vasia = new Person("Vasia" , "Korolev" , 53);
    Person petya = new Person("Petya", "Obama", 22);
    Person jordan = new Person("Maikl", "Jordan" ,32);
    Person jordan25 = new Person("Maikl", "Jordan" ,32);
    Person masha = new Person("Masha", "Koloveva", 18);
    Person petya5 = new Person("Petya", "Obama", 22);

    Set<Person> person = new HashSet<>();

    person.add(vasia);
    person.add(petya);
    person.add(jordan);
    person.add(jordan25);
    person.add(masha);
    person.add(petya5);

    System.out.println(person.size());
    System.out.println(person);

    List<Person> personList = new ArrayList<>();

    Person kamila = new Person("Kamila", "Vovk", 19);
    Person mila = new Person("Mila", "Vlasova", 44);

    personList.add(kamila);
    personList.add(mila);

    System.out.println(person.isEmpty());
    System.out.println(person.remove(vasia));
    System.out.println(person.size());

    System.out.println(person.contains(vasia));
    System.out.println(person.contains(petya));

    person.clear();
    System.out.println(person.size());
    person.addAll(personList);

    System.out.println(person.size());
    System.out.println(person.toArray()[1]);

    }
}
