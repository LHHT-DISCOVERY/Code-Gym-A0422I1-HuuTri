package ss10_stack_queue.exercise.demerging_queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {
    public static void main(String[] args) {
        ListEmployee listEmployee = new ListEmployee();
        Employee employee1 = new Employee("Tri", "male", 2001);
        listEmployee.addEmployee(employee1);
        Employee employee2 = new Employee("Linh", "female", 2001);
        listEmployee.addEmployee(employee2);
        Employee employee3 = new Employee("Thao", "female", 2001);
        listEmployee.addEmployee(employee3);
        Employee employee4 = new Employee("Thai", "male", 2001);
        listEmployee.addEmployee(employee4);
        listEmployee.print();
        Queue<String> male = new LinkedList<>();
        Queue<String> female = new LinkedList<>();
//        for (int i = 0; i < listEmployee; i++) {
//
//        }
    }
}
