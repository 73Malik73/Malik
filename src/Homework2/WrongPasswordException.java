package Homework2;

public class WrongPasswordException extends Exception {

    String message;

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        this.message = message;
    }
}
