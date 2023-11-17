import java.util.*;

public class Febonaci {
    static int febonaci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int pev = febonaci(n -1);
        int pevPev = febonaci(n -2);
        int ans = pev + pevPev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(febonaci(n));
    }

}
