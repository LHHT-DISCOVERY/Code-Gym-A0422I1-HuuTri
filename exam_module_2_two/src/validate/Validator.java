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
        format.setLenient(false);
        Date birthDay = null;
        try {
            birthDay = format.parse(birthAsString);
            return birthDay;
        } catch (ParseException e) {
            throw new UserException(Message.DATE_FORMAT);
        }
    }

    public static boolean validateTien(double soTien) throws UserException {
        if (soTien < 0) {
            throw new UserException(Message.TIEN_CORRECT);
        }
        return true;
    }
}
