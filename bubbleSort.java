import java.util.Arrays;

public class bubbleSort{
    public static void bubblesort(int a[]){
        int n = a.length;
        for(int i = 0;i < n-1;i++){
            boolean flag = false;
            for(int j = 0;j < n - i -1;j++){

                /* Last i element are already sorted position,
                 so no need to check them */
                if(a[j] > a[j+1]){
                    /*swap a[j] to a[j+1] */
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {7,6,5,4,3};
        bubblesort(a);
        for(int i : a){
             System.out.print(i+" ");
        }
       
    }
}