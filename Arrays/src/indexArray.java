// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
public class indexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sizze of array :");
        int size = sc.nextInt();
        int []arr = new int[size];
        // input
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to be search : ");
        int x = sc.nextInt();

        // Output
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println("x found at index : " +i);
            }
        }
    }
}
