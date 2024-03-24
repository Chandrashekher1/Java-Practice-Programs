public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // Insertion Sort
        for(int i =1;i<arr.length; i++ ){
            int current =arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
        for(int value:arr){
            System.out.print(value +" ");
        }
    }
}
