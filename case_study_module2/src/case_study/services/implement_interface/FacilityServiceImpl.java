package case_study.services.implement_interface;

import case_study.models.service.Facility;
import case_study.models.service.House;
import case_study.models.service.Room;
import case_study.models.service.Villa;
import case_study.services.interface_.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Integer, Facility> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public void add() {
        selectService();
    }

    public void addnewVilla() {
        System.out.print("Enter Name service villa : ");
        String nameService = scanner.nextLine();
        System.out.print("Enter Area used : ");
        double usedArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter price Hire : ");
        double priceHire = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter amount Human Hire :  ");
        int amountPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type hire  : ");
        String typeHire = selectTypeHire();
        System.out.print("Enter standardRoom : ");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter Area swimming : ");
        int areaSwimming = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter numberFloor : ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(nameService, usedArea, priceHire, amountPeople, typeHire, standardRoom, areaSwimming, numberFloor);
//        facilityIntegerMap.put(villa, 0);
    }

    public void addnewHouse() {
        System.out.print("Enter Name service house : ");
        String nameService = scanner.nextLine();
        System.out.print("Enter Area used : ");
        double usedArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter price Hire : ");
        double priceHire = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter amount Human Hire :  ");
        int amountPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type hire  : ");
        String typeHire = selectTypeHire();
        System.out.print("Enter standardRoom : ");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter Area swimming : ");
        double areaSwimming = Double.parseDouble(scanner.nextLine());
        House house = new House(nameService, usedArea, priceHire, amountPeople, typeHire, standardRoom, areaSwimming);
//        facilityIntegerMap.put(house, 0);
    }


    public void addnewRoom() {
        System.out.print("Enter Name service house : ");
        String nameService = scanner.nextLine();
        System.out.print("Enter Area used : ");
        double usedArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter price Hire : ");
        double priceHire = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter amount Human Hire :  ");
        int amountPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type hire  : ");
        String typeHire = selectTypeHire();
        System.out.print("Service free : ");
        String serviceFree = scanner.nextLine();
        Room room = new Room(nameService, usedArea, priceHire, amountPeople, typeHire, serviceFree);
//        facilityIntegerMap.put(room, 0);
    }

    public void selectService() {
        int select = 0;
        while (true) {
            System.out.println("---- Menu Service ---");
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.print("Enter select : ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    addnewVilla();
                    break;
                case 2:
                    addnewHouse();
                    break;
                case 3:
                    addnewRoom();
                    break;
                case 4:
                    return;
            }

        }
    }

    public void display() {
        for (Map.Entry<Integer, Facility> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "Số lần đã thuê: " + element.getValue());
        }
    }


    public void display(Class clazz) {
        for (Map.Entry<Integer, Facility> element : facilityIntegerMap.entrySet()) {
            Facility facility = element.getValue();
            if (clazz.isInstance(facility)) {
                System.out.println("Service" + element.getKey() + "Số lần đã thuê: " + facility.toString());
            }
        }
    }


    public void edit() {

    }

    public String selectTypeHire() {
        while (true) {
            System.out.println("--- select type hire ---  ");
            System.out.println("1. Hire Day \n" +
                    "2. Hire Month \n" +
                    "3. Hire Year\n" +
                    "4. Hire Hour");
            System.out.print("Enter select : ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    return "day";
                case 2:
                    return "month";

                case 3:
                    return "year";
                case 4:
                    return "hour";
            }
            System.out.println("Select again !");
        }
    }

}
