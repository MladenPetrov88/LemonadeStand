import java.util.Scanner;

public class LemonadeStand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lemonKg = Double.parseDouble(scan.nextLine());
        double sugarKg = Double.parseDouble(scan.nextLine());
        double water = Double.parseDouble(scan.nextLine()) * 1000;

        double lemonJuice = lemonKg * 980;
        double lemonade = lemonJuice + water;
        lemonade += sugarKg * 0.3;

        double cups = Math.floor(lemonade / 150);
        double finalPrice = cups * 1.2;

        System.out.println(String.format("All cups sold: %.0f", cups));
        System.out.println(String.format("Money earned: %.2f", finalPrice));
    }
}
