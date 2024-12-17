public class TradeCommisionAS {
    public static void main(String[]args){
            double a = 500;//Stocks
            double b = 33.89;//amount per share
            double c = .05;//the 5% of commision
            System.out.println(a*b + "0$");//The amount of all the stocks without commision
            System.out.println((a*b)*c + "$"); // The amount of commision
            System.out.println(((a*b)*c)+(a*b) + "$"); // the stock price + commision
    }
    }
//Greg bought 500 stocks at price of $33.89 per share. 
//He must pay his broker a 5 percent commission for the transaction. 
//Write a program that calculates and displays the following.
//The amount paid stock alone (without the commission)
//The amount of the commission
//The total amount paid (for the stock price + commission)
