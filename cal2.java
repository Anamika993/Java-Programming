/*
You must enter the numbers as follow.
first it will ask for the first number. we have to give it first number.
then it will ask for the second number. we have to give it second number.
then it will tells us about the digits we have just entered.
now you press a for addition, s for subtration, m for multiplication, d for division.
then press any from these to do the function.
*/

package src.program;

import java.util.Scanner;

public class cal2 {
    public static void main(String[] args) {
        float num_1, num_2;
        System.out.println("Enter the first number");

        Scanner scan = new Scanner(System.in);
        num_1 = scan.nextFloat();
        // Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the second number");
        num_2 = scan.nextFloat();

        System.out.print("You have entered ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.print(num_2);

        String fun = "  Now, press 1 for Addition, 2 for Subtration, 3 for Multiplication and 4 for division";
        System.out.println(fun);
        int result = scan.nextInt();

        switch (result) {

            case 1:
                System.out.println("By addiding these numbers, we get ");
                System.out.println(num_1 + num_2);
                break;

            case 2:
                System.out.println("By subtracting these numbers, we get ");
                System.out.println(num_1 - num_2);
                break;

            case 3:
                System.out.println("By multiplying these numbers, we get ");
                System.out.println(num_1 * num_2);
                break;

            case 4:
                System.out.println("By dividing these numbers, we get ");
                System.out.println(num_1 / num_2);
                break;

            default:
                System.out.println("Invalid syntax");
        }
    }
}