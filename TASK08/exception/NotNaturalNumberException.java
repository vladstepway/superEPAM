package by.stepovoy.task08.exception;

public class NotNaturalNumberException extends Exception {
    private int number;

    public NotNaturalNumberException(String s, int number) {
        super(s);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
