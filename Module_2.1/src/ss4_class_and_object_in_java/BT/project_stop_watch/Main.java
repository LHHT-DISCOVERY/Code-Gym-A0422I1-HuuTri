package ss4_class_and_object_in_java.BT.project_stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Select : ");
            System.out.println(" 1. Start time ");
            System.out.println(" 2. Stop time ");
            System.out.println(" 0. Exit ");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    stopWatch.startTime();
                    System.out.println(" Start time: " + stopWatch.getStartTime());
                    break;
                case 2:
                    stopWatch.stopTime();
                    System.out.println(" Stop time: " + stopWatch.getEndTime());
                    System.out.printf(" Elapsed time:  %,.3f (ms)" , stopWatch.getElapsedTime());
                    System.out.println();
                    break;
                case 0:
                    System.out.println(" You choice Exit ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice in Menu ...");
            }
        } while (choice != 0);
    }
}
