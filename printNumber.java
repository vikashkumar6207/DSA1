import java.util.*;
public class printNumber {
    static void printDecreasing(int n){
        // base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(n);
        // recursive work
        printDecreasing(n - 1);
    }
    // static int factorial(int a, int b){
    //     int sum = a + b;
    //     return sum;
    //     factorial(a, b)
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(factorial(x, y));

        printDecreasing(x);
    }
}
