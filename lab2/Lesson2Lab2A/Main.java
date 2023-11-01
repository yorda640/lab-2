package Lesson2Lab2A;

public class Main {
    public static void main(String[] args) {
        Student student= new Student("Mrinal");
        student.getGradeReport().setGrade("A");
        System.out.println(student.toString());

    }
}
