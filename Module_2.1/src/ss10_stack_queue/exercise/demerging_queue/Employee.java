package ss10_stack_queue.exercise.demerging_queue;

public class Employee {
    private String name;
    private String sex;
    private int yearOfBirth;

    public Employee() {
    }

    public Employee(String name, String sex, int yearOfBirth) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee : " +
                "name: " + name  +
                "\t | sex: " + sex  +
                "\t | yearOfBirth: " + yearOfBirth;
    }
}
