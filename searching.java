import java.util.Scanner;

public class searching {
    // static boolean search(int arr[], int n, int target, int idx){
            // if(idx >= n){
            //     return false;
            // }
            // if(arr[idx] == target){
            //     return true;
            // }
            // return search(arr, n, target, idx+1);
    // }
    static int findIndex(int arr[], int n, int target, int idx){

             if(idx >= n){
                return -1;
            }
            if(arr[idx] == target){
                return idx;
            }
            return findIndex(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // int target = sc.nextInt();
        int arr[] = {5, 6, 3, 8, 7};
        int target = 10;
        int n = arr.length;
        // if(search(arr, arr.length, target, 0)){
        //     System.out.println();
        // }else{
        //     System.out.println("No");
        // }

        System.out.println(findIndex(arr, n, target, 0));
    }
}
