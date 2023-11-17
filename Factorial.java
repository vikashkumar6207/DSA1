import java.util.*;
public class Factorial {
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int smallProblem = factorial(n-1);
        int ans = n *smallProblem;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
