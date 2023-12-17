package models;

import java.util.Arrays;

public class Result {
    String name;
    int grade;
    int roll_no;
    String section;
    String[] subject;
    int[] marks;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSection(String section) {
        this.section = section;
    }

    int mm;
    public Result(String name, int roll_no, String[] subject, int[] marks){
        this.name = name;
        this.subject = subject;
        this.roll_no = roll_no;
        this.marks = marks;

    }
    public void displayInformation(){
        String name = this.name;
        int roll_no = this.roll_no;
        int grade = this.grade;
        String section = this.section;
        String[] subject = this.subject;
        int[] marks = this.marks;

        System.out.println("Name:"+ name);
        System.out.println("Grade: " + grade);
        System.out.println("Roll number:"+roll_no);
        System.out.println("Section:"+section);
        System.out.println("Subject:"+ Arrays.toString(subject));
        System.out.println("Marks:"+Arrays.toString(marks));
    }
}
