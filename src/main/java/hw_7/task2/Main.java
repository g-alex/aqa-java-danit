package hw_7.task2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student vasia = new Student(10,"Vasia", 22 ,80);
        Student petya = new Student(2,"Petya", 25 ,85);
        Student sasha = new Student(38,"Sasha", 52 ,90);
        Student lesia = new Student(25,"Lesia", 33 ,70);
        Student masha = new Student(54,"Masha", 18 ,87);

        List<Student> students = new ArrayList<>();

        students.add(vasia);
        students.add(petya);

        Student.addStudent(students,sasha);
        Student.addStudent(students,lesia);
        Student.addStudent(students,masha);

        System.out.println("method 1 -----");
        System.out.println(students);
        System.out.println("method 2 -----");
        Student.printAllStudents(students);

        System.out.println("-----");
        Student.removeStudentById(students,25);
        System.out.println("-----");
        Student.printAllStudents(students);
        System.out.println("-----");

        Student foundStudent;
        foundStudent = Student.findStudentByName(students, "Vasia");
        if (foundStudent != null) {
            System.out.println(foundStudent);
        }

        System.out.println("-----");
        foundStudent = Student.findStudentByName(students, "Vasia235235");
        if (foundStudent != null) {
            System.out.println(foundStudent);
        }

        System.out.println("-----");
        Student.printAllStudents(students);






    }
}