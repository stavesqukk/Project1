package models;

import java.util.Arrays;

public class Student {
    String name;
    int grade;
    int roll_no;
    int[] marks;


    public Student(String name, int roll_no,  int... marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInformation(){
        String name = this.name;
        int rollno = this.roll_no;
        int grade = this.grade;
        int[] marks = this.marks;

        System.out.println("hello, This student is "+name+" with roll number "+rollno+" of grade "+ grade+ " with marks"+ Arrays.toString(marks));
    }
}