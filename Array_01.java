import java.util.Scanner;

public class Array_01 {
    static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i =0;i < n;i++){
        //     System.out.print(arr[i]+" ");
        // }

            printArray(arr);

            // tring to copy arr to arr_2
            int[] arr_1 = arr;
        //     for(int i =0;i < n;i++){
        //     System.out.print(arr_1[i]+" ");
        // }
        printArray(arr_1);

        //change some values in arr_1
        arr_1[0] = 5;
        arr_1[2] = 0;

        System.out.println("orignal array after chang some values");
        printArray(arr);

        System.out.println("copied arr_2 after changing some values");
        printArray(arr_1);
    }
}
