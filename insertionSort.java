import java.util.Arrays;

public class insertionSort{
    public static int[] insertionsort(int []arr){
        int n = arr.length;
        for(int i = 1;i < n;i++){
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}