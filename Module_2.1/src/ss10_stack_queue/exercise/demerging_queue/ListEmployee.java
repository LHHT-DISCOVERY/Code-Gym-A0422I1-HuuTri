package ss10_stack_queue.exercise.demerging_queue;

import java.util.ArrayList;

public class ListEmployee {
    ArrayList<Employee> employeeList = new ArrayList<>();

    public ListEmployee() {
    }

    public ListEmployee(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void print() {
        for (Employee employee1 :
                employeeList) {
            System.out.println(employee1);
        }
    }

    public static void main(String[] args) {

    }
}
