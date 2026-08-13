package hw_7.task2;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    static List<Student> addStudent(List<Student> students, Student student){
        students.add(student);
        return students;
    }
    static List<Student> removeStudentById(List<Student> students, int id){

        for (int i = 0 ; i <  students.size() ; i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
        return students;
    }
    static Student findStudentByName(List<Student> students, String name){
        Student toReturn = null;
        for(Student current : students){
            if(current.getName().equals(name))
            {
                toReturn = current;
                break;
            }
        }
        if (toReturn == null) {
            System.out.println("Not found");
        }
        return toReturn;
    }
    static void printAllStudents(List<Student> students){
        for(Student current : students){
            System.out.println(current);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
