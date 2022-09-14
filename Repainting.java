import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylon + 2) * 1.5;
        double paintSum = (paint + paint * 0.1) * 14.5;
        double thinnerSum = thinner * 5;
        double bagSum = 0.40;

        double materialsSum = nylonSum + paintSum + thinnerSum + bagSum;
        double craftsmanSum = (materialsSum * 0.3) * hours;

        double finalPrice = materialsSum + craftsmanSum;

        System.out.println(finalPrice);
    }
}
