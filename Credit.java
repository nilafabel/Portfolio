public class Credit{
    private String coustomername;
    private String coustomeremail;
    private CreditCard cardtype;
    public Credit(String n, String m, CreditCard c){
        this.coustomeremail = m;
        this.coustomername = n;
        this.cardtype = c;
    }
    public CreditCard getCardtype(){
        return cardtype;
    }
    public void showDetails(){
        System.out.println("\nName:\t\t"+ coustomername+"\nCustomer email:\t"+coustomeremail+"\nCard Type:\t"+cardtype);
    }
    public static void main(String[]args){
        Credit obj = new Credit ("Ben", "Ben@cstate.edu", CreditCard.MASTERCARD);
        obj.showDetails();

        switch (obj.cardtype) {
            case VISA:
                System.out.println("You got issued a VISA CARD");
                break;
            case MASTERCARD:
                System.out.println("You got issued a MC CARD");
                break;
            case AMEX:
                System.out.println("You got issued a AMEX CARD");
                break;
            case DISCOVER:
                System.out.println("You got issued a DISCOVER CARD");
                break;
            default:
                break;
        }

        CreditCard c=CreditCard.MASTERCARD;
        System.out.println(c.ordinal());
        System.out.println(c.name());
        System.out.println(c);
        System.out.println(c.toString());  
    }
}