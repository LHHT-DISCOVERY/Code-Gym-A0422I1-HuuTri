package case_study.validate;

import case_study.exception.UserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validator {
    public static Scanner scanner = new Scanner(System.in);

    public static Date validateBirthDay(String birthAsString) throws UserException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDay = null;
        Date now = new Date();
        try {
            birthDay = format.parse(birthAsString);
            if (now.getYear() - birthDay.getYear() < 18) {
                throw new UserException(Message.AGE_LESS_THAN_18);
            }
            return birthDay;
        } catch (ParseException e) {
            throw new UserException(Message.DATE_FORMAT);
        }
    }

    public static String enterName() {
        do {
            System.out.print("Enter Name Customer : ");
            String name = scanner.nextLine();
            try {
                if (validateName(name)) {
                    return name;
                }
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static String enterDate() {
        do {
            System.out.print("Enter Date  :");
            String date = scanner.nextLine();
            try {
                validateBirthDay(date);
                return date;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static boolean validateName(String name) throws UserException {
        char beginName = name.charAt(0);
        if (beginName < 65 || beginName > 97) {
            throw new UserException(Message.NAME_CORRECT);
        }
        return true;
    }
}
