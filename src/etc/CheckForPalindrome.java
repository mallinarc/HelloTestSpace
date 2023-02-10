package etc;

public class CheckForPalindrome{

    public static boolean isPalindrome(String str){

        int i = 0;
        int j = str.length() - 1;
        String lwrCaseStr = str.toLowerCase();
        while(i < j){
            if(lwrCaseStr.charAt(i) != lwrCaseStr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Saiaas"));
    }
}