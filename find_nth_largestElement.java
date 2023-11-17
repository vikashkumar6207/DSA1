import java.util.*;


public class find_nth_largestElement {
    static int findMax(int arr[]){
        int max = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;

    }
    public static int secondMax(int []arr){
        int max = findMax(arr);
        for(int i =0;i < arr.length -1;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int mx = findMax(arr);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }

        // Arrays.sort(arr);  
        // System.out.println("thargest largest number is : "+arr[n -3]+" ");
        
    }
}
