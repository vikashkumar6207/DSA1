import java.util.*;
public class find_X_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for(int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
            int left = 0;
            int right = n-1;
            
            for(int i = 0;i < n;i++){
                int mid = (left + right)/2;
                if(mid == k){
                    System.out.print(i);
                }else if(k < mid){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
                System.out.println();
            }
       System.out.println(arr[k]);
    }
}
