package src.program;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("the sum is " + sum);
    }
    
}
