package etc;

public class RecursionOne{

    //fabinoci numbers
    public static int summation(int n){
        if(n <= 0){
            return 0;
        }else{
            return n + summation(n-1);
        }
    } 

    public static void main(String[] args ){
        System.out.println("inside RecursionOne main.");
        System.out.println(" sum of consecutive numbers of int 100 is:"+summation(100));

    }
}