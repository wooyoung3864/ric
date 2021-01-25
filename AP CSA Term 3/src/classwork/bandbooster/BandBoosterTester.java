package classwork.bandbooster;
import java.util.Scanner;
public class BandBoosterTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter booster 1's name: ");
        String b1 = in.nextLine();
        System.out.println("Enter booster 2's name: ");
        String b2 = in.nextLine();

        BandBooster boo1 = new BandBooster(b1);
        BandBooster boo2 = new BandBooster(b2);

        System.out.println("Enter booster 1's sales: ");
        int sales1 = in.nextInt();
        boo1.updateSales(sales1);

        System.out.println("Enter booster 2's sales");
        int sales2 = in.nextInt();
        boo2.updateSales(sales2);

        System.out.println(boo1);
        System.out.println(boo2.toString());

    }
}
