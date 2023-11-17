import java.util.*;

public class sumOfDigit {
    static int digitSum(int n){
        if(0 <= n && n<= 9){
             return n;
        }
   int Ldigit = digitSum(n/10);
   
   int ans = Ldigit + n % 10;
   return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));
    }
}