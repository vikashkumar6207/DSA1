import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class maxOdd {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxOdd = -1, maxEven = -1;
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            if(num%2==0){
                if(maxEven < num){
                    maxEven = num;
                }
            }else{
                if(maxOdd<num){
                    maxOdd = num;
                }
            }
        }

        if(maxOdd!=-1 && maxEven!=-1){
            System.out.println(maxEven+maxOdd);
        }else{
            System.out.println(-1);
        }
        
    }
}

