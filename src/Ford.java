public class Ford extends Auto implements Stand {
    public Ford(String model, int yearOfIssue) {
        super(model, yearOfIssue);
    }

    @Override
    public void stand() {
        System.out.println("Ford грациозно стоит");
    }

    private boolean heatedWindshield = true;
    private int numberOfSeatHeatingModes = 5;

    public int getNumberOfSeatHeatingModes() {
        return numberOfSeatHeatingModes;
    }

    public void setNumberOfSeatHeatingModes(int numberOfSeatHeatingModes) {
        this.numberOfSeatHeatingModes = numberOfSeatHeatingModes;
    }

    public boolean isHeatedWindshield() {
        return heatedWindshield;
    }

    public void setHeatedWindshield(boolean heatedWindshield) {
        this.heatedWindshield = heatedWindshield;
    }

    public static String[] getFlaws = {};
}
