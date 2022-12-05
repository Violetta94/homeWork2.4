package exceptions;

import java.util.regex.Pattern;

public class Data {

    public static void  checkData (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!stringCorrect(login)) {
            throw new WrongLoginException("Логин указан не верно");
        }
        if (stringCorrect(password)&& password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны верно");
        } else {
            throw new WrongPasswordException("Пароль указан не верно");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null || checkString.isEmpty() || checkString.isBlank() || checkString.length() > 20) {
         return false;
        }
        return Pattern.matches( "[a-zA-Z0-9_]*$", checkString);
    }
}
