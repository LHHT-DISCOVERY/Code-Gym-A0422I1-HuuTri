package case_study.services.implement_interface;

import case_study.models.human.Employee;
import case_study.services.interface_.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private static Scanner scanner = new Scanner(System.in);


    public void add() {
        System.out.print("Enter Name Employee : ");
        String name = scanner.nextLine();
        System.out.print("Enter Date Employee : ");
        String date = scanner.nextLine();
        System.out.print("Enter Sex Employee : ");
        String sex = scanner.nextLine();
        System.out.print("Enter CMND Employee : ");
        int cmnd = scanner.nextInt();
        System.out.print("Enter Phone Employee : ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Email Employee :  ");
        String email = scanner.nextLine();
        System.out.print("Enter ID Employee : ");
        String employeeId = scanner.nextLine();
        System.out.println("|| --- Enter Skill Employee ---|| ");
        String skill = selectSkill();
        System.out.println("|| --- Enter Position Employee ---||");
        String position = selectPosition();
        System.out.print("Enter Wage employee : ");
        int wage = scanner.nextInt();
        scanner.nextLine();
        Employee employee = new Employee(name, date, sex, cmnd, phone, email, employeeId, skill, position, wage);
        employeeList.add(employee);
    }

    public void display() {
        for (Employee employee : employeeList
        ) {
            System.out.println(employee);
        }
    }

    public void edit() {
        editEmployee();
    }


    public void editEmployee() {
        System.out.println(" Enter ID Employee need Edit : ");
        String idEmployeeEdit = scanner.nextLine();
        boolean isFlag = false;
        for (Employee employee : employeeList
        ) {
            if (employee.getEmployeeId().equals(idEmployeeEdit)) {
                isFlag = true;
            }
        }
        if (isFlag) {
            for (Employee employee : employeeList
            ) {
                if (employee.getEmployeeId().equals(idEmployeeEdit)) {
                    int choice;
                    while (true) {
                        menuEdit();
                        System.out.print("Enter select Edit : ");
                        choice = scanner.nextInt();
                        if (choice == 0) {
                            scanner.nextLine();
                            return;
                        }
                        switch (choice) {
                            case 1:
                                scanner.nextLine();
                                System.out.print(" Enter new Name : ");
                                String newName = scanner.nextLine();
                                employee.setName(newName);
                                System.out.println("Edit Name Successful ");
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.print(" Enter new date : ");
                                String newDate = scanner.nextLine();
                                employee.setDate(newDate);
                                System.out.println("Edit newDate Successful ");
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.print(" Enter new Sex : ");
                                String newSex = scanner.nextLine();
                                employee.setSex(newSex);
                                System.out.println("Edit newSex Successful ");
                                break;
                            case 4:
                                scanner.nextLine();
                                System.out.print(" Enter new CMND : ");
                                int newCMND = scanner.nextInt();
                                employee.setCMND(newCMND);
                                System.out.println("Edit setCMND Successful ");
                                break;
                            case 5:
                                System.out.print(" Enter new Phone : ");
                                int newPhone = scanner.nextInt();
                                employee.setPhone(newPhone);
                                System.out.println("Edit newPhone Successful ");
                                break;
                            case 6:
                                scanner.nextLine();
                                System.out.print(" Enter new Email : ");
                                String newEmail = scanner.nextLine();
                                employee.setEmail(newEmail);
                                System.out.println("Edit newEmail Successful ");
                                break;
                            case 7:
                                scanner.nextLine();
                                System.out.print(" Enter new Email : ");
                                String newIdEmployee = scanner.nextLine();
                                employee.setEmployeeId(newIdEmployee);
                                System.out.println("Edit newIdEmployee Successful ");
                                break;
                            case 8:
                                System.out.print(" Enter Edit Skill \n");
                                employee.setSkill(selectSkill());
                                System.out.println("Edit new Skill Successful ");
                                break;
                            case 9:
                                System.out.print(" Enter new Position \n ");
                                employee.setPosition(selectPosition());
                                System.out.println("Edit new position Successful ");
                                break;
                            case 10:
                                System.out.print(" Enter new wage : ");
                                int newWage = scanner.nextInt();
                                employee.setWage(newWage);
                                System.out.println("Edit newWage Successful ");
                                break;
                            default:
                                System.out.println(" Not select \n ** Again Enter select ** \n");
                        }
                    }
                }
            }
        } else {
            System.out.println("Not search ID employee");
        }
    }

    public void menuEdit() {
        System.out.println(" --- Select Edit ---- ");
        System.out.println("1.\tEdit Name \n" +
                "2.\tEdit Date\n" +
                "3.\tEdit Sex\n" +
                "4.\tEdit CMND\n" +
                "5.\tEdit Phone\n" +
                "6.\tEdit Email\n" +
                "7.\tEdit ID\n" +
                "8.\tEdit Skill\n" +
                "9.\tEdit Position\n" +
                "10.\tEdit  Wage\n" +
                "0.\tQuit Edit \n");
    }

    public String selectPosition() {
        while (true) {
            System.out.println("||----- Selection Position -----||");
            System.out.println("1.\tReception\n" +
                    "2.\tWaiter\n" +
                    "3.\tSpecialist\n" +
                    "4.\tSupervisor\n" +
                    "5.\tManager\n" +
                    "6.\tDirector\n");
            System.out.print("Enter select : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return "Reception";
                case 2:
                    return "Waiter";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
            }
            System.out.println("Not select !! \n ** Again Enter select position ** \n");
        }
    }

    public String selectSkill() {
        while (true) {
            System.out.println("||------ Select Skill ------ ||");
            System.out.println("1.\tTrung Cấp \n" +
                    "2.\tCao đẳng \n" +
                    "3.\tĐại học \n" +
                    "4.\tSau đại học \n");
            System.out.print("Enter select Skill: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return " Trung Cấp ";
                case 2:
                    return " Cao Đẳng ";
                case 3:
                    return " Đại Học ";
                case 4:
                    return " Sau Đại Học ";
            }
            System.out.println("Not select !! \n ** Again Enter select Skill **\n ");
        }
    }
}