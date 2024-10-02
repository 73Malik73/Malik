public abstract class Auto {
    protected String model;
    protected int yearOfIssue;

    public Auto(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    protected void startEngine() {
        System.out.println("Врум-врум");
    }
}
