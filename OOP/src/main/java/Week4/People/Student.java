package Week4.People;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int credits;
    private int student_id;
    private List<Integer> grades;

    public Student(String name, String address, int age, String country, int credits, int student_id) {
        super(name,address, age, country);
        this.credits = 0;
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public int getCredits() {
        return this.credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getStudent_id() {
        return this.student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public List<Integer> getGrades() {
        return grades;
    }

    public void study() {
        this.credits++;
    }
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }


    public String toString() {
        return super.toString() + "\n  Credits: " + credits + "\n  Student ID: " + student_id + "\n  Grades: " + grades;
    }

}
