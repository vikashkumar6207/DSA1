import java.util.Scanner;

public class number_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //binary to decimal
      /*  int binary_Number = sc.nextInt();

        int ans = 0;
        int pw = 1;
        while(binary_Number > 0){
            int unit_digit = binary_Number % 10;
            ans += (unit_digit * pw);
            binary_Number /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    */

// decimal to binary
        int decimal_Num = sc.nextInt();
        int pw = 1;
        int ans = 0;
        while (decimal_Num > 0) {
            int parity = decimal_Num % 2;
            ans += (parity *pw); 
            pw *= 10;
            decimal_Num /= 2;           
        }
        System.out.println(ans);

    }
}
