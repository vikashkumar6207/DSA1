import java.util.Scanner;

public class sumofTwoNumberEqualsTarget {
    static int targetSum(int arr[], int target){
        int n = arr.length;
        int count = 0;
        for(int i = 0;i < n;i++){
            for(int j = i +1;j < n;j++){
                for(int k = i+2;k < n;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(targetSum(arr,target));

    }
}
