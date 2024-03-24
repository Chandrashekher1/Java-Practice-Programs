import java.util.*;

public class Amax {
    public static void main(String[] args) {
        int[] arr = {1,3,5,23,9};
        System.out.println(max(arr));
        //System.out.println(Arrays.toString(arr));

    }
    // Imagine that arr is not empty
    static int max(int[]arr ){
        int maxVal = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
