class ArraysExample{
    void multiArrays(){
        int arr[][] = {{4,5,7},{2,8,9},{6,4,2}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        
        System.out.println(arr.length);
    }
}

    public class array {   
    public static void main(String[] args) {
        
        // int ages[] = new int[3];

        //     ages[0] = 32;
        //     ages[1] = 26;
        //     ages[2] = 22;
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        ArraysExample obj = new ArraysExample();
        obj.multiArrays();        
    }
}