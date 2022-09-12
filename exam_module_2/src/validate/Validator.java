package validate;

import exception.UserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validator {
    public static Scanner scanner = new Scanner(System.in);
    public static Date validate(String birthAsString) throws UserException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDay = null;
        try {
            birthDay = format.parse(birthAsString);
            return birthDay;
        } catch (ParseException e) {
            throw new UserException(Message.DATE_FORMAT);
        }
    }

    public static boolean validateTienGui(double soTienGui) throws UserException {
        if (soTienGui < 1000000) {
            throw new UserException(Message.TIEN_CORRECT);
        }
        return true;
    }
}
