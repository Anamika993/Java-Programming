//Practice problem 2 :- Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class array_numfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of an array: ");
        int a = sc.nextInt();

        int[] num = new int[a];

        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();

        boolean isInArray = false;

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i< num.length; i++){
            num[i] = sc.nextInt();
            if(n==num[i]){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in  the array.");
        }
        else {
            System.out.println("The value is not present in the array.");
        }

    }
}
