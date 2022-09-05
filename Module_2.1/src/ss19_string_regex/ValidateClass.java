package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {

    public static final String REGEX_CLASS = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_CLASS);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" Enter name class : ");
            String name = scanner.nextLine();
            if (!pattern.matcher(name).matches()) {
                System.out.println(" !! false again name ");
            } else {
                System.out.println("Enter successful");
                break;
            }
        } while (true);
    }
}
