import java.util.Scanner;

public class purchase {
    static Scanner input = new Scanner(System.in);
    static int balance = 0, product;
    public static int purchase() {
        System.out.println("Please select your product.");
        // select the product
        product = input.nextInt();

        switch (product) {
            case 0:
                balance += 0;
                return balance;
            case 1:
                balance += 36;
                break;
            case 2:
                balance += 45;
                break;
            case 3:
                balance += 55;
                break;
            case 4:
                balance += 125;
                break;
            case 5:
                balance += 150;
                break;
            default:
                System.out.println("Invalid Products");
        }
        return balance;
    }
}

