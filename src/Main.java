import Homework2.Auth;

public class Main {
    public static void main(String[] args) {
        String login = "User_123";
        String password = "validPass123";
        String confirmPassword = "validPass123";

        boolean isSignUpSuccessful = Auth.signUp(login, password, confirmPassword);

        if (isSignUpSuccessful) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }
    }
}