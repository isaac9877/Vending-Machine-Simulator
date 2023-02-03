import java.util.Scanner;

public class payment {
    static Scanner input = new Scanner(System.in);
    static int coins, bills, total, options;
    public static int payment() {
        System.out.println("\nPlease select the payment method.");
        do {
            // enter money options
            System.out.println("0. Stop Enter Money");
            System.out.println("1. Enter coins");
            System.out.println("2. Enter bills");
            options = input.nextInt();



            if (options == 0) {
                break;
            }
            // The vending machine accepts coins,
            else if (options == 1) { // 1 for coins
                System.out.println("Enter coins");
                do {
                    coins = input.nextInt();
                    // enter coins
                    switch (coins) {
                        case 0:
                            break;
                        case 1: // penny
                            total += 1;
                            break;
                        case 5: // nickle
                            total += 5;
                            break;
                        case 10: // dime
                            total += 10;
                            break;
                        case 25: // quarter
                            total += 25;
                            break;
                        default:
                            System.out
                                    .println("Invalid Coins, Please enter the new coins");
                    }
                } while (coins != 0);
            } else if (options == 2) {// 2 for bills
                // 1 dollar bills, and 5 dollar bills
                System.out.println("Enter bills");

                do {
                    bills = input.nextInt();
                    // enter bills
                    switch (bills) {
                        case 0:
                            break;
                        case 1: // 1 dollar
                            total += 100;
                            break;
                        case 5: // 5 dollar
                            total += 500;
                            break;
                        default:
                            System.out
                                    .println("Invalid Bills, Please enter the new bills");
                    }
                } while (bills != 0);
            } else {
                System.out.println("Invalid Options");
            }
        } while (options != 0);

        return total;
    }

}

