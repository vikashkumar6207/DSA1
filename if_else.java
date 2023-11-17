import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = 10;
        // if(a % 2 == 0 && a % 3 ==0){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }

        int b = sc.nextInt();
        if(b % 3 == 0 || b % 5 == 0){
        System.out.println(b);
        }else{
            System.out.println("enter valid input");
        }
    }
}