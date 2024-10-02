public class Lada extends Auto implements Movement {
    public Lada(String model, int yearOfIssue) {
        super(model, yearOfIssue);
    }

    @Override
    public void movingForward() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Lada едет вперед");
        }
    }

    @Override
    public void movingBackward(boolean isWallBehind) {
        if (isWallBehind) {
            System.out.println("Нельзя ехать назад");
        } else {
            System.out.println("Lada едет назад");
        }
    }

    private boolean rust = false;
    private boolean presenceOfSubwoofer = true;

    public boolean isRust() {
        return rust;
    }

    public void setRust(boolean rust) {
        this.rust = rust;
    }

    public boolean isPresenceOfSubwoofer() {
        return presenceOfSubwoofer;
    }

    public void setPresenceOfSubwoofer(boolean presenceOfSubwoofer) {
        this.presenceOfSubwoofer = presenceOfSubwoofer;
    }

    public static String peopleName = "Тазик";
}
