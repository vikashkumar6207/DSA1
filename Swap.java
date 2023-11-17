import java.util.Arrays;

public class Swap{
    // static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("A = "+a+", B =  "+b);
    //     // System.out.println("B = "+b);
    // }

    static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        static int[] reverseArray(int[] arr){
            int n = arr.length;
            int ans[] = new int[n];
            int j = 0;
            for(int i = n-1;i >= 0;i--){
                ans[j] = arr[i];
                j++;
            }
            return ans;
        }
    public static void main(String []args){
        int a = 9;
        int b = 3;
        int arr[] = {1, 2, 3, 4, 5};
        // swap(a, b);
        int ans[] = reverseArray(arr);
        // for(int i = 0;i < ans.length;i++){
        //     System.out.print(ans[i]+", ");
        // }
        printArray(ans); 
    }
}