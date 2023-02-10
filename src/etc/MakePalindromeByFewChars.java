package etc;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Make a given word a palindrome by adding fewer chars
 */

 public class MakePalindromeByFewChars{
    private static final Scanner scan = new Scanner(System.in);
    public static void palindromeProcess(String inStr){
        if(StringUtils.isNotBlank(inStr)){
            if(inStr.length() == 1) {// if length of string is one then it is palindrome no need to append chars.
                System.out.println(inStr);
            }else{
                String orgStr = new String(inStr);
                int i = 0;
                int j = (inStr.length() -1);
                int position =0;
                // loop string biderectional and compare chars.
                do{
                    char lftStr = inStr.charAt(i);
                    char rgtStr = inStr.charAt(j);
                    if(lftStr != rgtStr){
                        orgStr = orgStr.substring(0, position) + rgtStr + orgStr.substring(position);
                        position++;                     
                    }else{
                        i++;
                    }
                    j--;
                }while(i<=j);           
                System.out.println("Input string converted to palindrom:"+orgStr);
            }
        }else{
            System.out.println("You have entered nothing.");
        }
    }

   public static void main(String[] args) {
        
        palindromeProcess(scan.nextLine());
        
        for(int i=0, j=10; i<j; i++, j--){
        //    for(int i=0, j=5; i < 5; i++, j--){
            System.out.println("i:"+i+"j:"+j);
        }

        scan.close();

    }
 }