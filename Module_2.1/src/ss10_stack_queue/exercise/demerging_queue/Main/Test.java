package ss10_stack_queue.exercise.demerging_queue.Main;

import ss10_stack_queue.exercise.demerging_queue.Employee;
import ss10_stack_queue.exercise.demerging_queue.ListEmployee;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        //create list employee
        ListEmployee listEmployee = new ListEmployee();
        Employee employee1 = new Employee("TRI", "MALE", 2001);
        Employee employee2 = new Employee("LINH", "FEMALE", 2001);
        Employee employee3 = new Employee("THAO", "MALE", 2001);
        Employee employee4 = new Employee("THUAN", "FEMALE", 2001);
        Employee employee5 = new Employee("TOAN", "MALE", 2001);
        Employee employee6 = new Employee("HUONG", "FEMALE", 2001);
        Employee employee7 = new Employee("THAI", "MALE", 2001);
        listEmployee.addEmployee(employee1);
        listEmployee.addEmployee(employee2);
        listEmployee.addEmployee(employee3);
        listEmployee.addEmployee(employee4);
        listEmployee.addEmployee(employee5);
        listEmployee.addEmployee(employee6);
        listEmployee.addEmployee(employee7);

        // output list employee
        System.out.println("----List employee----");
        listEmployee.print();

        // create Queue male and female
        Queue<String> male = new LinkedList<>();
        Queue<String> female = new LinkedList<>();

        // check male and female
        for (int i = 0; i < listEmployee.size(); i++) {
            String name = listEmployee.get(i).getName();
            int year = listEmployee.get(i).getYearOfBirth();
            String info = "Name is : " + name + " || Year Of Birth " + year;
            if (listEmployee.get(i).getSex().equals("MALE")) {
                male.offer(info);
            } else if (listEmployee.get(i).getSex().equals("FEMALE")) {
                female.offer(info);
            }
        }

        // output male
        System.out.println("---- employee male ----  ");
        while (!male.isEmpty()) {
            System.out.println(male.poll());
        }

        // output female
        System.out.println("---- employee female ---- ");
        while (!female.isEmpty()) {
            System.out.println(female.poll());
        }
    }
}
