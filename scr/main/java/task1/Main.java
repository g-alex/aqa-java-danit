package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> persons = new HashMap<>();
        boolean isWork = true;
        while (isWork) {
            System.out.println("What doing? \n1:addPerson \n2:getPerson \n3:exit \nWrite command: \n");
            String command = scanner.nextLine();

            switch (command) {
                case "addPerson":
                    System.out.println("Write surname");
                    String surname = scanner.nextLine();

                    System.out.println("Write name");
                    String name = scanner.nextLine();

                    System.out.println("Write age");
                    int age;
                    while (true){
                    if (!scanner.hasNextInt()) {
                        System.out.println("ERROR: Use only number , try again");
                        scanner.nextLine();
                    }
                    else {
                         age = scanner.nextInt();
                         scanner.nextLine();
                         break;
                    }}
                    String originalSurname = surname;
                    surname = surname.toUpperCase();
                    if (persons.containsKey(surname))
                    {
                        System.out.println("Duplicate \n Do you want replace? , answer yes\\no");
                        String qestion = scanner.nextLine();
                        if(qestion.equals("yes")){
                            System.out.println("Replace " + originalSurname);
                            persons.put(surname , new Person(name,originalSurname,age));
                        }
                        else {
                            System.out.println();
                        }
                    }
                    else{
                        persons.put(surname , new Person(name,originalSurname,age));
                    }

                    break;
                case "getPerson":
                    System.out.println("Write surname for search");
                    String surnameFind = scanner.nextLine();
                    surnameFind = surnameFind.toUpperCase();
                    if(persons.containsKey(surnameFind)){
                        System.out.println(persons.get(surnameFind));
                    }
                    else
                    {
                        if(persons.isEmpty()){
                            System.out.println("List empty");
                    }
                        else
                        {
                            System.out.println("Not found " + surnameFind + "\nFull list");
                            System.out.println();
                            for (String key : persons.keySet()) {
                                System.out.println(key);
                            }
                        }
                    }

                    break;
                case "exit":
                    System.out.println("Bye Bye");
                    isWork = false;
                    break;

                default:
                    System.out.println("ERROR: Wrong command , try again");

            }
        }
    }
}
