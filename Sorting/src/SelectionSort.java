public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        // Selection sorting
        for(int i =0; i<arr.length-1; i++){
            int smallest = i;
            for(int j =i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            // Swapping
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int value:arr){
            System.out.print
                    (value);
        }

    }
}
