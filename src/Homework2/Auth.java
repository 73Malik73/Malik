package Homework2;

public class Auth {

    static String regex = "^[a-zA-Z0-9_]{1,19}$";

    public static boolean signUp(String login, String password, String confirmPassword) {
        boolean result = true;
        try {
            boolean validLogin = isValidLogin(login);
            boolean validPassword = isValidPassword(password, confirmPassword);
            if (!(validLogin && validPassword)) {
                result = false;
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            result = false;
        }
        return result;
    }

    private static boolean isValidLogin(String login) throws WrongLoginException {
        boolean result = login.matches(regex);
        if (result) {
            return true;
        } else {
            throw new WrongLoginException();
        }
    }

    private static boolean isValidPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        boolean result = password.matches(regex);
        if (result) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }
}
