// import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // int num = 1;
        // do{
        //     System.out.println(num);
        //     num++;
        // }while(num <= 10);


        // print the sum of the streem of the integer in the input

            // int num = sc.nextInt();
            // int sum = 0;
            // while(num !=-1){
            //     sum = sum + num;
            //     num = sc.nextInt();
            // }
            // System.out.println(sum);


            //print the first multipal of 5 which is also is multipal of 7.
            
            // int num = 1;
            // while(true){
            //     if((num % 5 == 0) && (num % 7 == 0)){
            //         System.out.println(num);
            //         break;
            //         // continue;
            //     }
            //     num++;
            // }


            // print all the values between 1 to 50 except for the multipal of 3.

            for(int num = 1; num <=50;num++){
                if(num % 3 == 0){
                    continue;
                }
                System.out.println(num);
            }

    }
}
