public class RetailPrice {
 public static void main(String[] args) {

    double wholesalecost=90;
    double markuppercent=0.25;
    double retailprice;
    retailprice=calculateRetail(wholesalecost, markuppercent);
    System.out.println(retailprice);
 }  
 public static double calculateRetail(double w,double m)
 {
   // double retailprice;
   // retailprice=w+(w*m);
  //  return retailprice;
    return w+(w*m);
 }

}
