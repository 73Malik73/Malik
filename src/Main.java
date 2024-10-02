import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lada lada = new Lada("Четырка", 2007);
        Ford ford = new Ford("Фокус", 2008);

        ford.stand();

        lada.startEngine();
        lada.movingBackward(true);
        lada.movingForward();
        lada.movingBackward(false);

        System.out.println(Lada.peopleName);

        if (Ford.getFlaws.length > 0) {
            System.out.println(Arrays.toString(Ford.getFlaws));
        } else {
            System.out.println("Идеальная машина");
        }
    }
}