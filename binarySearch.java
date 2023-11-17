import java.util.*;

public class binarySearch {
    static boolean search(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(mid == target){
                return true;
            }else if(target < mid){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, target));
    }
}
