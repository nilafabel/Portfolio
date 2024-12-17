public class FlightCounter
{
    private static int seatcounter=20;
    //it creates in a global memory can be accessable by any object,
    //
    private int availableseats;
    //20 are available seats
    public FlightCounter()//constructor
    {
       seatcounter--;
       availableseats=seatcounter;
    }
    public int getAvilableseats()
    {
        return availableseats;
    }
    public static void main(String[] args) {
        FlightCounter fc1=new FlightCounter();
        System.out.println("Seats available- "+fc1.getAvilableseats());
        FlightCounter fc2=new FlightCounter();
        FlightCounter fc3=new FlightCounter();
        FlightCounter fc4=new FlightCounter();
        FlightCounter fc5=new FlightCounter();
        System.out.println("Seats available- "+fc5.getAvilableseats());
    }
}