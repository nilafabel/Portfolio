package HwforCh10;
public class PreferredReaderAS extends Reader{//PreferredReader which extends the Reader class. 
    private double readerPurchases;//Reader's purchases
    private double discountLevel;//Customer’s discount level. 
    public PreferredReaderAS(String name, String address, String telephoneNumber, boolean mailingList, double readerPurchases){//Constructor for PrefferedReader
        super(name, address, telephoneNumber, mailingList);
        this.readerPurchases = readerPurchases;
        calculateDiscountLevel();
    }
//////////////////////////////////////////////////
    public void setReaderPurchases(double readerPurchases){//mutator(set) method for reader's purchases
        this.readerPurchases = readerPurchases;
        calculateDiscountLevel();
    }
    public double getReaderPurchases(){//accessor(get) method for reader's purchases
        return readerPurchases;
    }
//////////////////////////////////////////////////
    public void getDiscountLevel(double discountLevel){//mutator(set) method for discount level
        this.discountLevel = discountLevel;
    }
    public double getDiscountLevel(){//mutator(set) method for discount level
        return discountLevel;
    }
//////////////////////////////////////////////////
    private void calculateDiscountLevel(){//calculator to determine the amount of a reader’s discount by the amount of the reader’s purchases
        if(readerPurchases >= 500) {//If a reader spends $500
            discountLevel = 0.05; //They get a 5 percent discount on all future book purchases.
        }
        else if(readerPurchases >= 1000){//If a reader spends $1,000
            discountLevel = 0.06;//They get a 6 percent discount on all future book purchases.
        } 
        else if(readerPurchases >= 1500){//If a reader spends $1,500
            discountLevel = 0.07;//They get a 7 percent discount on all future book purchases.
        } 
        else if(readerPurchases >= 2000){ //If a reader spends $2,000 or more
            discountLevel = 0.10;//They get a 10 percent discount on all future book purchases.
        } 
        else{
            discountLevel = 0.0;//If they don't spend any, they get no discount
        }
    }
//////////////////////////////////////////////////
    public double applyDiscount(double purchaseAmount){//mehod that applies the discount
        return purchaseAmount * (1 - discountLevel);
    }
//////////////////////////////////////////////////
    public static void main(String[] args){//Demonstration of the class in a simple program.
        PreferredReaderAS reader1 = new PreferredReaderAS("Anastasia", "420 Seasame St", "6158828171", true, 2000);//object of the PreferredReader class
        System.out.println("Reader Information:");
        System.out.println("Name: " + reader1.getName());//prints name from the Student class getName method
        System.out.println("Address: " + reader1.getAddress());//prints address from the Student getAddress method
        System.out.println("Telephone Number: " + reader1.getTelephoneNumber());////prints telephone # from the Student getTelephoneNumber method
        System.out.println("Wishes to be on Mailing List: " + (reader1.isMailingList() ? "Yes" : "No"));//prints out if the reader wants to be on the mailing list
        System.out.println("Reader's Purchases: $" + reader1.getReaderPurchases());//prints out readers's purchases from the getReaderPurchases method
        System.out.println("Discount Level: " + (reader1.getDiscountLevel() * 100) + "%");//gets the discount  
        System.out.println("Discounted purchase amount: $" + reader1.applyDiscount(100));//calls the apply discount method 
    }
}
/*
 * A retail store has a preferred reader plan where readers can earn discounts on all their book purchases. 
 * The amount of a reader’s discount is determined by the amount of the reader’s cumulative purchases in 
 *      the store as follows:
 * When a reader spends $500, he or she gets a 5 percent discount on all future book purchases.
 * When a reader spends $1,000, he or she gets a 6 percent discount on all future book purchases.
 * When a reader spends $1,500, he or she gets a 7 percent discount on all future book purchases.
 * When a reader spends $2,000 or more, he or she gets a 10 percent discount on all future book purchases.
 * 
 *  
 * Design a class named PreferredReader, which extends the Reader class. 
 * The PreferredReader class should have fields for the amount of the Reader’s purchases and the customer’s 
 *      discount level. 
 * Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields. 
 * Demonstrate the class in a simple program.
 */ 
