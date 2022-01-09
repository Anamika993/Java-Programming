//Find a peak element in an array.

import java.util.Scanner;

public class peak_element {
    static int peakFind(int[] arr, int n){
        if(n==1){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-1] > arr[n-2]){
            return n-1;
        }

        for(int i = 1; i < n-1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1] )
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of an array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Index of peak point is "+ peakFind(arr,arr.length));
    }
}
