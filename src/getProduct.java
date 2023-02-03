public class getProduct {
    static int kitkat = 5, mars = 5, reeses = 5, twix = 5, snickers = 5;
    static int  inventory = kitkat + mars + reeses + twix + snickers;
    public static void display() {
        purchase prod = new purchase();
        switch (prod.product) {
            case 1:
                System.out.println("Here is your Kitkat, please come back!");
                kitkat--;
                break;
            case 2:
                System.out.println("Here is your Mars bar, please come back!");
                mars--;
                break;
            case 3:
                System.out.println("Here is your Reese's cup, please come back!");
                reeses--;
                break;
            case 4:
                System.out.println("Here is your Twix bar, please come back!");
                twix--;
                break;
            case 5:
                System.out.println("Here is your Snickers bar, please come back!");
                snickers--;
                break;
        }
    }

}

