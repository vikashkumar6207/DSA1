import java.util.*;
public class nested_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c = sc.nextInt();

/*      * * * * * *
        * * * * * *
        * * * * * *
        for(int i = 1;i <= r;i++){
            for(int j = 0;j < c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

    /* 
        ******
        *    *
        *    *
        ******
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <= c;j++){
                if((i == 1 || i == r) ||( j == 1 || j == c)){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    */

    /* 
            *
            * *
            * * *
            * * * *
        for(int i = 1;i <= r;i++){
            for(int j = 1;j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

/* 
            * * * * * 
            * * * * 
            * * * 
            * * 
            *

        for(int i = r;i >=1;i--){
            for(int j = 1;j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

/* 
    *
   ***
  *****
 *******
*********
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <= r-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
/*
        12345
        23451
        34512
        45123
        51234
        
        
        for(int i = 1;i <= r;i++){
            for(int j = i;j <= r;j++){
                System.out.print(j);
            }
            for(int k = 1;k <= i-1;k++){
                System.out.print(k);
            }
         System.out.println();   
        }
        */

/* 
        12345
        12345
        12345
        12345
        12345
        int c = sc.nextInt();
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <= c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        // int c = sc.nextInt();
        // for(int i = 1;i <= r;i++){
        //     for(int j = 1;j <= c;j++){
        //         if(i == 1 || i == r || j == 1 || j == c){
        //             System.out.print(j);
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //      System.out.println();
        // }

/*
 12121
21212
12121
21212
12121

        int c = sc.nextInt();
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <= c;j++){
                if((i+j)%2 == 0){
                     System.out.print(1);
                }else{
                    System.out.print(2);
                }
               
            }
            System.out.println();
        }
        */

/* 
1
12
123
1234
12345
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */

/* 

   1
  121
 12321
1234321
*/
        for(int i = 1;i <= r;i++){
            for(int j = 1;j <=r-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k <= i;k++){
                System.out.print(k);
            }
            for(int l = i-1;l >=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        


    }
}
