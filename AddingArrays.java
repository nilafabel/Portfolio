package Ch7;

public class AddingArrays {
    public static void main (String[]args){
        int[]first={1,2,3,4,5,6,7,8};
        int[]second={10,20,30,40,50,60,70,80};
        int[]third=new int[5];
        if(first.length == second.length){
            for(int i = 0;i<third.length;i++){
                third[i] = first[i]+second[i];
            }
        }
        for(int i : third){
            System.out.println(i);
        }
    }
}
//add 1st array and 2nd array 
//the results should be stored in the 3rd array


