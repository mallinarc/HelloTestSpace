package etc;

public class TwoDArray{

    public static void main(String[] args) {
        /*
        {{13, 4, 8, 14, 1}
         {9, 6, 3, 7, 21},          => 
         {5, 12, 17, 9, 3}}

        */
        int[][] arr = {{13, 4, 8, 14, 1},{9, 6, 3, 7, 21},{5, 12, 17, 9, 3}};
        System.out.println("Array Length:"+arr.length);
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length > j)
                j = arr[i].length;
            System.out.println("Each row length:"+5);
        }

        int width = arr.length;
        int height = arr[0].length;
        int[][] newArr = new int[height][width];
        System.out.println("Array rows:"+newArr.length+":new Array columns:"+newArr[0].length);

        for(int x = 0; x < width; x++){//iterate over each row this will be new column element in newArr
            for(int y = 0; y < height; y++){ //iterate over each column this element will be new row element
                newArr[y][x] = arr[x][y];
            }

        }

        for (int i = 0; i < newArr.length; i++) {
            for (int y = 0; y < newArr[0].length; y++) {
              System.out.print(newArr[i][y] + " ");
              
            }
            System.out.print("\n");
          } 
    }
}