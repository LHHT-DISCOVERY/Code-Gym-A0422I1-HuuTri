package case_study.services.implement_interface;

import case_study.models.human.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl {
    Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> customerLinkedList = new LinkedList<>();

    public void add() {
        System.out.print("Enter ID Customer : ");
        String customerId = scanner.nextLine();
        System.out.print("Enter Name Customer : ");
        String name = scanner.nextLine();
        System.out.print("Enter Date Customer : ");
        String date = scanner.nextLine();
        System.out.print("Enter Sex Customer : ");
        String sex = scanner.nextLine();
        System.out.print("Enter CMND Customer : ");
        int cmnd = scanner.nextInt();
        System.out.print("Enter Phone Customer : ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Email Customer :  ");
        String email = scanner.nextLine();
        System.out.print("Enter type Customer : ");
        String typeCustomer = scanner.nextLine();
        System.out.print("Enter address customer : ");
        String addressCustomer = scanner.nextLine();

        Customer customer = new Customer(name, date, sex, cmnd, phone, email, customerId, typeCustomer, addressCustomer);
        customerLinkedList.addLast(customer);
    }


    public void display() {
        for (Customer customer : customerLinkedList
        ) {
            System.out.println(customer);
        }
    }

    void edit() {
        editCustomer();
    }

    public void editCustomer() {
        System.out.println(" Enter ID Customer need Edit : ");
        String idCustomerEdit = scanner.nextLine();
        boolean isFlag = false;
        for (Customer customer : customerLinkedList
        ) {
            if (customer.getCustomerId().equals(idCustomerEdit)) {
                isFlag = true;
            }
        }
        if (isFlag) {
            for (Customer customer : customerLinkedList
            ) {
                if (customer.getCustomerId().equals(idCustomerEdit)) {
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
                                customer.setName(newName);
                                System.out.println("Edit Name Successful ");
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.print(" Enter new date : ");
                                String newDate = scanner.nextLine();
                                customer.setDate(newDate);
                                System.out.println("Edit newDate Successful ");
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.print(" Enter new Sex : ");
                                String newSex = scanner.nextLine();
                                customer.setSex(newSex);
                                System.out.println("Edit newSex Successful ");
                                break;
                            case 4:
                                scanner.nextLine();
                                System.out.print(" Enter new CMND : ");
                                int newCMND = scanner.nextInt();
                                customer.setCMND(newCMND);
                                System.out.println("Edit setCMND Successful ");
                                break;
                            case 5:
                                System.out.print(" Enter new Phone : ");
                                int newPhone = scanner.nextInt();
                                customer.setPhone(newPhone);
                                System.out.println("Edit newPhone Successful ");
                                break;
                            case 6:
                                scanner.nextLine();
                                System.out.print(" Enter new Email : ");
                                String newEmailCustomer = scanner.nextLine();
                                customer.setEmail(newEmailCustomer);
                                System.out.println("Edit newEmailCustomer Successful ");
                                break;
                            case 7:
                                scanner.nextLine();
                                System.out.print(" Enter new ID : ");
                                String newIdCustomer = scanner.nextLine();
                                customer.setCustomerId(newIdCustomer);
                                System.out.println("Edit newIdCustomer Successful ");
                                break;
                            case 8:
                                scanner.nextLine();
                                System.out.print(" Enter new type customer : ");
                                String newTypeCustomer = scanner.nextLine();
                                customer.setTypeCustomer(newTypeCustomer);
                                System.out.println("Edit newTypeCustomer Successful ");
                                break;
                            case 9:
                                scanner.nextLine();
                                System.out.print(" Enter new address customer : ");
                                String newAddressCustomer = scanner.nextLine();
                                customer.setAddress(newAddressCustomer);
                                System.out.println("Edit newAddressCustomer Successful ");
                                break;
                            default:
                                System.out.println(" Not select \n ** Again Enter select ** \n");
                        }
                    }
                }
            }
        } else {
            System.out.println("Not search ID customer");
        }
    }

    public void menuEdit() {
        System.out.println(" --- Select Edit ---- ");
        System.out.println("1.\tEdit Name customer \n" +
                "2.\tEdit Date customer\n" +
                "3.\tEdit Sex customer\n" +
                "4.\tEdit CMND customer\n" +
                "5.\tEdit Phone customer\n" +
                "6.\tEdit Email customer\n" +
                "7.\tEdit ID customer\n" +
                "8.\tEdit type customer\n" +
                "9.\tEdit address customer\n" +
                "0.\tQuit Edit customer\n");
    }
}
