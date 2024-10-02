package hw1;

public abstract class Auto {
    protected String model;
    protected int yearOfIssue;

    public Auto(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public void startEngine() {
        System.out.println("Врум-врум");
    }
}
