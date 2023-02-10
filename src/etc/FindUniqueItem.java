package etc;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindUniqueItem{

    static class Calculator{
        int ans = 0;
        public int power(int n,int p){
            
            System.out.println("n:"+n+":P:"+p);
            ans = n;
            if(n < 0 || p < 0 ){
                throw new IllegalArgumentException("n and p should be non-negative.");
            }
            
            p = p-2;
            while(p > 0){
                ans = ans * ans;
                p--;
            }
            return ans;
        }
    }
    
    public static void main(String[] args) {
        
        //int[] input = {6, 1, 3, 3, 3, 6, 6};
        /* int[] input = {13, 19, 13, 13};
        List<Integer> res = new ArrayList();
        try{
            String s = "3";
            int i = Integer.parseInt(s);
        }catch(Exception ex){
            System.out.println("Bad String:");
        }
        
        
        for(int i = 0; i < input.length; i++){
            int count = 0;
            for(int j = 0; j < input.length; j++){               
                if( i != j){
                    System.out.println("input[i]:"+input[i] +":input[j]:"+input[j]);
                    if(input[i] == input[j]){
                        count++;
                     break;
                    }
                }
            }
            System.out.println(count);
            if(count == 0){
                res.add(input[i]);
            }
        }
        for(int k =0; k < res.size(); k++){
            System.out.println("Unique item:"+ res.get(k));
        } */

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}