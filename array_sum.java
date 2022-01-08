//Practice problem 1 :- Create an array of 5 integers and calculate their sum.

import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks =new int[5];
        int sum = 0;

        System.out.println("Enter the elements of an array one by one:");
        for(int i=0; i<marks.length;i++){

            marks[i] = sc.nextInt();
            sum = sum + marks[i];

        }
        System.out.println("The value of sum is"+sum);

    }
}
