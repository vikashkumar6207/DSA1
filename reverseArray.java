public class reverseArray {
    static int[] reverse(int arr[], int left, int right){
        left = 0;
        right = arr.length -1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = arr[temp];
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = arr.length;
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(reverse(arr, n, n));
    }
}
