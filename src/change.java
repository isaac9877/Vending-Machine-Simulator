public class change {
    static int change;
    public static String calCoins(int changes) {
        String changeString = "";
        int quarters, remQuarters=0;
        int dimes, remDimes=0;
        int nickles, remNickles=0;
        int pennies=0;

        quarters = change/25;
        remQuarters =change%25;
        changeString += quarters + " quarters\n";

        if(remQuarters!=0) {
            dimes = remQuarters/10;
            remDimes = remQuarters%10;
            changeString += dimes + " dimes\n";
        }

        if (remDimes!=0) {
            nickles = remDimes/5;
            remNickles = remDimes % 5;
            changeString += nickles + " nickles\n";
        }

        if (remNickles!=0) {
            pennies = remNickles;
            changeString += pennies + " pennies\n";
        }
        return changeString;
    }

    public static String change() {
        purchase bal = new purchase();
        payment t = new payment();
        String changeDisplay="";
        if (t.total > bal.balance) {
            change = t.total - bal.balance;
            //calculate for coins
            changeDisplay = calCoins(change);
        }
        else {
            changeDisplay ="Enter more money";
            t.payment();

        }

        return changeDisplay;
        // /////////////////////END change module/////////////////////////////

    }
}

