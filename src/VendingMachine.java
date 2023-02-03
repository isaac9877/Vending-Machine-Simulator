public class VendingMachine {
    public static void main(String[] args) {
        purchase p = new purchase();
        payment pay = new payment();
        getProduct item = new getProduct();
        change val = new change();
        System.out.println("HELLO Customer!");
        // The vending machine offers 5 products\
        int stock = item.inventory;
        int balance;
        do {
            System.out.println("0. Get money back");
            System.out.println("1. Kitkat\t$.36");
            System.out.println("2. Mars\t\t$.45");
            System.out.println("3. Reese\t$.55");
            System.out.println("4. Twix\t\t$1.25");
            System.out.println("5. Snicker\t$1.50");
            balance = p.purchase();
            if(p.product == 0){
                return;
            }
            if(balance == 0) {
                return;
            }
                int payBal = pay.payment();
                int rem = balance - payBal;
            do {
                if (rem >= 1) {
                    System.out.println("you are missing $" + rem);
                    pay.payment();
                }
                if (payBal > balance) {
                    System.out.println(val.change());
                    rem = rem + val.change;
                }
            } while (rem != 0);
            item.display();
        }while (stock != 0 && balance != 0 );
    }

}
