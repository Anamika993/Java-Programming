// Create a new class called Calculator with the following methods: 
// 1. A static method called powerInt(int num1,int num2)
// This method should return num1 to the power num2.
// 2. A static method called powerDouble(double num1,int num2).
// This method should return num1 to the power num2.
// 3. Invoke both the methods and test the functionalities.
// Hint: Use Math.pow(double,double) to calculate the power.

import java.lang.Math;
import java.util.Scanner;

class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(powerInt(sc.nextInt(), sc.nextInt()));
        System.out.println(powerDouble(sc.nextDouble(), sc.nextDouble()));
    }
}
        
    
