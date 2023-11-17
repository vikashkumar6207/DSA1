import java.util.*;
public class count_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans = 0;
        for(int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
         for(int j =0; j < n;j++){
            if(arr[j] == k){
                ans++;
            }
        }
           
        System.out.println(ans);
    }
}
