package etc;

import java.util.Arrays;

public class KthSmallestElement{


    // quicksort Partition

    //quickSort
    public static void quickSort(int[] arr, int start, int high){
        
    }

    //swap


    // find kth smallest element in the sorted array.
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(temp > arr[i])
                temp = arr[i];
        }
        double d = Math.log(100.0)/Math.log(2.0);
        System.out.println(" d:"+d);
        int inte = Double.valueOf(Math.pow(2.0, Math.ceil(d))).intValue();
        System.out.println(" d:"+inte);

        int[] x = {13, 19, 9, 5, 12, 8, 7, 4, 21 , 2, 6, 11};
		System.out.println(Arrays.toString(x));
 
		int low = 0;
        int high = x.length - 1;
        System.out.println("low:"+low+":High:"+high);
 
		quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }
}