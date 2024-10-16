package Homework2;

public class WrongLoginException extends Exception{
    String message;

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        this.message = message;
    }
}
