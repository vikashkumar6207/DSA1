import java.util.Arrays;


/* Selection sort */
public class selectionSort {
    // public static int[] selectionsort(int arr[]){
    //     int n = arr.length;
    //     for(int i = 0;i < n;i++){
    //         int minIdx = i;
    //         for(int j = i;j < n;j++){
    //             if(arr[j] < arr[minIdx]){
    //                 minIdx = j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i] = arr[minIdx];
    //         arr[minIdx] = temp;
    //     }
    //     return arr;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {9,5,6,3,14};
    //     System.out.println(Arrays.toString(arr));
    //     selectionsort(arr);
    //     System.out.println(Arrays.toString(arr));

    // }

    /* Find minimum index & minnimum value */
    public static void main(String[] args) {
        int arr[] = {10,11,6,5,7};
        int n = arr.length;
        int minIdx = i;
        for(int i = 0;i < n;i++){
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        System.out.println(minIdx+" "+arr[minIdx]);
    }
}
