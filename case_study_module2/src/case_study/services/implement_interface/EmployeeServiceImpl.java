package case_study.services.implement_interface;

import case_study.exception.UserException;
import case_study.models.human.Employee;
import case_study.read_and_write.ReadAndWriteFile;
import case_study.services.interface_.EmployeeService;
import case_study.validate.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private static Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.print("Enter ID Employee : ");
        String employeeId = scanner.nextLine();
        String name = enterName();
        String date = enterDate();
        System.out.print("Enter Sex Employee : ");
        String sex = scanner.nextLine();
        System.out.print("Enter CMND Employee : ");
        int cmnd = scanner.nextInt();
        System.out.print("Enter Phone Employee : ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Email Employee :  ");
        String email = scanner.nextLine();
        System.out.println("|| --- Enter Skill Employee ---|| ");
        String skill = selectSkill();
        System.out.println("|| --- Enter Position Employee ---||");
        String position = selectPosition();
        System.out.print("Enter Wage employee : ");
        Double wage = scanner.nextDouble();
        scanner.nextLine();
        Employee employee = new Employee(name, date, sex, cmnd, phone, email, employeeId, skill, position, wage);
        employeeList.add(employee);
        ReadAndWriteFile.writeToFile("E:\\Code_Gym_A0422I1_HuuTri\\Module_2.1\\src\\case_study\\data\\data_employee.csv", employeeList);
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
                                String newNameEmployee = enterName();
                                employee.setName(newNameEmployee);
                                System.out.println("Edit Name Successful ");
                                break;
                            case 2:
                                scanner.nextLine();
                                String newDate = enterDate();
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
                                System.out.print(" Enter new ID : ");
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
                                Double newWage = scanner.nextDouble();
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
        System.out.println("1.\tEdit Name Employee\n" +
                "2.\tEdit Date Employee\n" +
                "3.\tEdit Sex Employee\n" +
                "4.\tEdit CMND Employee\n" +
                "5.\tEdit Phone Employee\n" +
                "6.\tEdit Email Employee\n" +
                "7.\tEdit ID Employee\n" +
                "8.\tEdit Skill Employee\n" +
                "9.\tEdit Position Employee\n" +
                "10.\tEdit Wage Employee\n" +
                "0.\tQuit Edit Employee\n");
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

    public String enterName() {
        do {
            System.out.print("Enter Name Customer : ");
            String name = scanner.nextLine();
            try {
                if (Validator.validateName(name)) {
                    return name;
                }
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public String enterDate() {
        do {
            System.out.print("Enter Date  :");
            String date = scanner.nextLine();
            try {
                Validator.validateBirthDay(date);
                return date;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}