// Write a program that will check whether a given String is Palindrome or not.

import java.util.Scanner;

class stringPallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int length = a.length();
        String b = "";
        for (int i = length - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
