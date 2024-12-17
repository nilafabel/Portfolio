package Ch11;
/**@Exception NavigateStartingBalance */
public class NavigateStartingBalance extends Exception {
    public NavigateStartingBalance(){
        super("Error: Navigate starting balance");
    }
    public NavigateStartingBalance (double amount){
        super("Error: Navigate starting balance" + amount);
    }
}
/* 
  __     __
<{o ) | (o }>
////  ^ ////
      ~
     
*/