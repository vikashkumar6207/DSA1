import java.util.Scanner;

public class GraterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int ans = 0;
        
        
        int arr[] = new int[n];
        for(int i = 0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = -1;
        for(int j = 0;j < n;j++){
            
            // if(ans < arr[j]){
            //     ans = arr[j];
            // }
            if(arr[j] == k){
                ans = j;
            }
        }
        // System.out.println(ans);
        System.out.println(ans);
    }
}
