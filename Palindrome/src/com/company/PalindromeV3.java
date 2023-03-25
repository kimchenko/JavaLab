package com.company;
import java.util.Scanner;

public class PalindromeV3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num = in.next();
        if (num.length()!=5)
        {
            System.out.println("Error");
            return;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(num);
        String reverse = num;
        if (num.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}
