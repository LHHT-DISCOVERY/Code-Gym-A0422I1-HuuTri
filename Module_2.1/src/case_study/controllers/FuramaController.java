package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    int select = 0;

    public void displayMainMenu() {
        do {
            System.out.println(" --------------MeNu-----------------\n" +
                    " 1.\tEmployee Management\n" +
                    " 2.\tCustomer Management\n" +
                    " 3.\tFacility Management \n" +
                    " 4.\tBooking Management\n" +
                    " 5.\tPromotion Management\n" +
                    " 6.\tExit\n" +
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
                    "| 1\tDisplay list employees\n" +
                    "| 2\tAdd new employee\n" +
                    "| 3\tEdit employee\n" +
                    "| 4\tReturn main menu\n"
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


    public void CustomerManagement() {
        do {
            System.out.println(" ----------Customer Management ----------\n" +
                    "| 1.\tDisplay list customers\n" +
                    "| 2.\tAdd new customer\n" +
                    "| 3.\tEdit customer\n" +
                    "| 4.\tReturn main menu\n"
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

    public void FacilityManagement() {
        do {
            System.out.println(" ----------Customer Management ----------\n" +
                    "| 1\tDisplay list facility\n" +
                    "| 2\tAdd new facility\n" +
                    "| 3\tDisplay list facility maintenance\n" +
                    "| 4\tReturn main menu\n"
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
                    "| 1.\tAdd new booking\n" +
                    "| 2.\tDisplay list booking\n" +
                    "| 3.\tCreate new constracts\n" +
                    "| 4.\tDisplay list contracts\n" +
                    "| 5.\tEdit contracts\n" +
                    "| 6.\tReturn main menu\n" +
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
                    "| 1.\tDisplay list customers use service\n" +
                    "| 2.\tDisplay list customers get voucher\n" +
                    "| 3.\tReturn main menu\n" +
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
