package case_study.controllers;

import case_study.services.implement_interface.CustomerServiceImpl;
import case_study.services.implement_interface.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    int select = 0;
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    public void displayMainMenu() {
        do {
            System.out.println(" --------------MeNu------------------\n" +
                    "| \t1.\tEmployee Management\t\t\t|\n" +
                    "| \t2.\tCustomer Management\t\t\t|\n" +
                    "| \t3.\tFacility Management\t\t\t|\n" +
                    "| \t4.\tBooking Management\t\t\t|\n" +
                    "| \t5.\tPromotion Management\t\t|\n" +
                    "| \t6.\tExit\t\t\t\t\t\t|\n" +
                    " ----------------END-----------------\n\n");
            System.out.print("Enter select  : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    EmployeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                    BookingManagement();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    System.out.println(" ---------- END ------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not Select");
            }
        } while (select != 0);
    }

    public void EmployeeManagement() {
        do {
            System.out.println(" ---------- Employee Management ----------\n" +
                    "| \t1\tDisplay list employees\n" +
                    "| \t2\tAdd new employee\n" +
                    "| \t3\tEdit employee\n" +
                    "| \t4\tReturn main menu\n"
                    + "-----------------END----------------------\n\n");
            System.out.print("Enter select : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    scanner.nextLine();
                    employeeService.display();
                    break;
                case 2:
                    scanner.nextLine();
                    employeeService.add();
                    break;
                case 3:
                    scanner.nextLine();
                    employeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Not select");
            }
        } while (true);
    }


    public void CustomerManagement() {
        do {
            System.out.println(" ----------Customer Management ----------\n" +
                    "| \t1.\tDisplay list customers\n" +
                    "| \t2.\tAdd new customer\n" +
                    "| \t3.\tEdit customer\n" +
                    "| \t4.\tReturn main menu\n"
                    + "-----------------END----------------------\n\n");
            System.out.print("Enter select : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    scanner.nextLine();
                    customerService.add();
                    break;
                case 3:
                    scanner.nextLine();
                    customerService.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Not select");
            }
        } while (true);

    }

    public void FacilityManagement() {
        do {
            System.out.println(" ----------Customer Management ----------\n" +
                    "| \t1\tDisplay list facility\n" +
                    "| \t2\tAdd new facility\n" +
                    "| \t3\tDisplay list facility maintenance\n" +
                    "| \t4\tReturn main menu\n"
                    + "-----------------END----------------------\n\n");
            System.out.print("Enter select : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Not select");
            }
        } while (true);
    }

    public void BookingManagement() {
        do {
            System.out.println(" ---------- Booking Management ----------\n" +
                    "| \t1.\tAdd new booking\n" +
                    "| \t2.\tDisplay list booking\n" +
                    "| \t3.\tCreate new constracts\n" +
                    "| \t4.\tDisplay list contracts\n" +
                    "| \t5.\tEdit contracts\n" +
                    "| \t6.\tReturn main menu\n" +
                    "-----------------END----------------------\n\n");
            System.out.println("Enter select : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Not select");
            }
        } while (true);
    }

    public void PromotionManagement() {
        do {
            System.out.println(" ----------Promotion Management ----------\n" +
                    "| \t1.\tDisplay list customers use service\n" +
                    "| \t2.\tDisplay list customers get voucher\n" +
                    "| \t3.\tReturn main menu\n" +
                    "-----------------END----------------------\n\n");
            System.out.print("Enter select : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Not select");
            }
        } while (true);
    }
}
