package app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;



public class App {

    /**
    * find two numbers, from an array of integers, such that they add up to a specific target number. 
   */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        int[] result = new int[]{0,0};
        for( int i = 0; i <nums.length; i++){
            intMap.put(nums[i], i);
        }
        for(int i = 0; i <  nums.length; i ++){
            int difference = target - nums[i];
            if(intMap.containsKey(difference)){
              int idx = intMap.get(difference);
               if(idx == i)
                 continue;
               result[0] = i;
               result[1] = idx;
                System.out.println(Arrays.toString(result));
                 return result;
			}            
        }
        throw new IllegalArgumentException("No solution");       
    }

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            Integer count = map.get(ar[i]);
            if (count == null)
                map.put(ar[i], 1);
            else
                map.put(ar[i], count + 1);
            }

        int uniqueCount = 0;
       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
            
        }

        for (Integer i : map.values()){
            System.out.println(" value:"+(i%2));
            if (((i/2)%2) == 0 || ((i/2)%2) == 1){
                uniqueCount += (i/2);
            }
        }
        return uniqueCount;

    }

     /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum=0, sum1=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    sum+=arr.get(i).get(j);
                }
                if(i==arr.size() - j- 1){
                    sum1+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sum - sum1);

    }
     

    /**
     * Given an integer, n, perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.
     */
    /* private static void findCondition(int n){
         if(n > 0){
            if((n >= 1 && n < 6) || (n > 20)){
                if(n%2 == 1){
                    System.out.printf("n is {} is Wiered.", n);
                }else{
                    System.out.printf("n is {} is NOT Wiered.", n);
                }
            }
            if(n > 5 && n < 21){
                System.out.printf("n is {} is Wiered.", n);               
            }
        } 

        
    }
 */

    /**
    * find two numbers, from an array of integers, such that they add up to a specific target number. 
    */
    public static int[] sortedTwoSum(int[] nums, int target){
        int[] result = new int[]{0,0};               
        int diff = 0;
        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            int foundIdx = Arrays.binarySearch(nums, diff);
            if(foundIdx >= 0){
                if( foundIdx != i){
                    result[0] = i+1;
                    result[1] = foundIdx+1;
                    return result;
                }else{
                    foundIdx = Arrays.binarySearch(nums, foundIdx, nums.length-1, diff);
                     result[0] = i+1;
                    result[1] = foundIdx+1;
                    return result;
                }
            }else{
                
                continue;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    static void plusMinus() {
        
        
        int noOfNeg = 0;
        int noOfPos = 0;
        int noOfZero = 0;
        int[] arr ={-4, 3, -9, 0, 4, 1};
        int arrySize = arr.length;

        for(int i = 0; i < arrySize; i++){
            if(arr[i] < 0 ){
                noOfNeg += 1;
            }else if (arr[i] == 0){
                noOfZero += 1;
            }else{
                noOfPos += 1;
            }
        }
        System.out.println(""+noOfPos+".."+noOfZero+"..."+noOfNeg);
        double postiveFract = (double) noOfPos / arrySize;
        double zeroFract = (double) noOfZero / arrySize;
        double negetiveFract = (double) noOfNeg / arrySize;
        System.out.println("..postiveFract:"+postiveFract+"...zeroFract:"+zeroFract+"...negetiveFract:"+negetiveFract);
        
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
       
        float tip = ((float)meal_cost * ((float)tip_percent / (float)100));
        System.out.println(tip);
        float tax = (float) meal_cost * ((float)tax_percent / (float)100);
        System.out.println(tax);
        System.out.println(meal_cost);
        float totalCost = ((float)meal_cost + tip + tax);
        System.out.println("total Cost:"+totalCost);
        System.out.println(Math.round(totalCost));
    }

    static void loopMethod(int n){
        int prod = 0;
        for(int i = 1; i <= 10; i++)
        {
            prod = (n*i);
            System.out.printf("%d X %d = %d%n",n , i, prod);
        }
    }

    public static void printRevArray(int[] a){
        System.out.println(a.length);
        for(int i = (a.length - 1); i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }

    public static void StringEnvenOddSeperation(String[] strArray){
        
        for(int j = 0;  j < strArray.length; j++){
            String str = strArray[j];
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i=0; i < str.length(); i++){
                if(i%2 == 0 ){
                    sb1.append(str.charAt(i));
                }else{
                    sb2.append(str.charAt(i));
                }
            }
            System.out.print(sb1.toString() + " " + sb2.toString() + "\n");
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        /* int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arrItems = new String[n];
        for (int i = 0; i < n; i++)
       {
            arrItems[i] = scanner.nextLine();
       }
        StringEnvenOddSeperation(arrItems);
        scanner.close(); */

        //int[] numbers = {1,2,3,4,4,9,56,90};
        // printRevArray(numbers);
        //loopMethod(2);
         int[] numbers={1,2,3,4,4,9,56,90};
         System.out.println("Length of Array :"+numbers.length);
         for(int i =0; i < numbers.length; i++){
             System.out.println("index:"+ i +" value:"+numbers[i]);
         }
        //int target=8;
        //int[]  result = 
        // twoSum(numbers, target);
        //int[] result = sortedTwoSum(numbers, target);
        // System.out.println(Arrays.toString(result));

        //plusMinus();

        //int n = 10;

       String nullString = null;
       String whiteSpaceStr = " ";
       String emptyString = "";
       String initializedStr = "Sitting";
       //System.out.println(initializedStr.contains("k"));

       //System.out.println("check null string for using java isEmpty():"+whiteSpaceStr.isEmpty());
       //System.out.println("Check null string for using apache common isBlank():"+StringUtils.isBlank(nullString));
       
       int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        Arrays.sort(ar);
        System.out.printf("Modified ar[] : %s", Arrays.toString(ar));
        //int answer = sockMerchant(n, ar);
        //System.out.println(".....answer:"+answer);
       
        //scanner.close();
       //findCondition(2);

     /*   int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        //Scanner scan = new Scanner(System.in);

        int i2 = 0;
        double d2 = 0.0;
        String s2 = "";

        //System.out.print("Insert an Integer: ");
        //i2 = scan.nextInt();
        //System.out.println("Insert a double number:");
        //d2 = scan.nextDouble();
        //System.out.println("Insert a String:");
        // Read a full line of input from stdin and save it to our variable, inputString.
        //s2 = scan.next();
        //scan.close();
        /* Print the sum of both integer variables on a new line. */
        //System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
        /*System.out.println(d + d2);
        System.out.println(s+s2); */

        /* Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
        sc.close(); */
       // solve(12.00, 20, 8);
    }
}