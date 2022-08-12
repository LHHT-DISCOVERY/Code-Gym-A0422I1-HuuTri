package ss10_stack_queue.exercise.demerging_queue;

import java.util.ArrayList;

public class ListEmployee {
    public ArrayList<Employee> employeeList;

    public ListEmployee() {
        this.employeeList = new ArrayList<>();
    }


    public ListEmployee(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public int size() {
        return employeeList.size();
    }

    public Employee get(int i) {
        return employeeList.get(i);

    }

    public void print() {
        for (Employee employee1 :
                employeeList) {
            System.out.println(employee1);
        }
    }

}
