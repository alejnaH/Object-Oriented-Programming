package Week4.People;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary, int age, String country) {
        super(name, address, age, country);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return super.toString() + "\n  Salary: " + salary;
    }

}
