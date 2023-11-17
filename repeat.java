import java.util.Scanner;

public class repeat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0;j < n;j++){
            for(int k = j + 1;k < n;k++){
                if(arr[j] == arr[k]){
                    System.out.println(arr[i]);
                    break;
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
