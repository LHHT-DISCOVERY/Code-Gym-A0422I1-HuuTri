package case_study.models.human;
import case_study.models.human.Person;

public class Employee extends Person {
    private String employeeId;
    private String skill;
    private String position;
    private double wage;

    public Employee() {
    }


    public Employee(String name, String date, String sex, int CMND, int phone, String email, String employeeId, String skill, String position, double wage) {
        super(name, date, sex, CMND, phone, email);
        this.employeeId = employeeId;
        this.skill = skill;
        this.position = position;
        this.wage = wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee | "+ " employeeId='" + employeeId + '\'' +
                super.toString() +
                ", skill='" + skill + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage + " $" ;
    }
}
