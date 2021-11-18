// Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
// If the input is “Apple” then the output should be “ApApApApAp”

import java.util.Scanner;
import java.util.*;

class chars {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int length = a.length();
        if (length > 1) {
            String b = "";
            char[] arr = a.toCharArray();
            char x = arr[0], y = arr[1];
            for (int i = 0; i < length; i++) {
                b += x;
                b += y;
            }
            System.out.println(b);
        } else
            System.out.println(a);
    }
}
