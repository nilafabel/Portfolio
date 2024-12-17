public class Stock {
    private double stockprice;
    private String stocksym;
    public Stock(double p, String s){
        this.stockprice = p;
        this.stocksym = s;
    }
    public double getPrice(String s){
        if(this.stocksym.equals(s)){//the same as == but this is more correct
            return stockprice;
        }
        return -1;
    }
    @Override//Sub class enhancing the super class method
    public String toString(){//This is overriding the super class method
        String msg = "Current price "+stocksym+" "+stockprice;
        return msg;
    }
    public boolean equals(Stock obj){
        if(stocksym.equals(obj.stocksym)&&stockprice==obj.stockprice){
            return true;
        }
        else{
            return false;
        }
    }
}
