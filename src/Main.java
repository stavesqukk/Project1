import models.Result;
import models.Student;

public class Main {

    public static void main(String[] args) {

        //1st Question
        int[] marks1;
        marks1 = new int[]{20,30,40};
        int[] marks3 = {30,50,70};

        Student std1;
        std1 = new Student("Muskan",24023,  marks1);
        int[] marks2 = {30, 40, 50};
        Student std2;
        std2 = new Student("Anushree", 24012, marks2);
        Student std3;
        std3 = new Student("Simone", 24042,marks3);

        std1.setGrade(12);
        std2.setGrade(12);
        std3.setGrade(12);


        std1.displayInformation();
        std2.displayInformation();
        std3.displayInformation();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tREPORT CARD\t\t\t\t\t\t\t\t\t");
        //2nd question
        int[] marks4 = {30,40,60};
        String[] subject2 = {"Physics","Maths","Chemistry"};

        Result std4;
        std4 = new Result("Muskan",24023, subject2, marks4);
        std4.setGrade(12);
        std4.setSection("Lobuche");
        std4.displayInformation();

    }
}