// import java.util.*;
public class digitSum {
    static int dsum(int num){
        // Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 79752;
        while(num > 9){
            num = dsum(num);      
        
        }
        System.out.println("your number is : "+num);
    }
}
