package etc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//find how many max height candles on birthday cake.
public class BirthdayCandles{

    public static int birthdayCakeCandles(int[] ar){
        if (ar.length == 0)
            return 0;

        int max = ar[0];
        int count = 0;
        for(int j = 1; j < ar.length; j++){
            if(ar[j] > max){
                max = ar[j];
            }
        }
        for(int i = 0; i < ar.length; i++){
            System.out.println("max:"+max+"ar[i]"+ar[i]);
            if(ar[i] > max || ar[i] == max){
                max = ar[i];
                count++;
                System.out.println(".......:"+count);
            }
        }
        return count;
    }

    public static int findMax(int[] ar){
        int max = 0;

        for(int i=0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }

    public static int findMin(int[] ar){
        int min = ar[0]; // you cant initilize to zero as no positive integer going to be less than zero
        for(int i = 0; i< ar.length; i++){
            if(ar[i]<min)
                min = ar[i];
        }
        return min;
    }

    public static int maxDiff(int[] ar){
        
        return (findMax(ar) - findMin(ar));
    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        //int result = birthdayCakeCandles(ar);
        int result = maxDiff(ar);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}