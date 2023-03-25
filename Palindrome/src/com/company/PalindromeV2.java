package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeV2 {

    private static int getNumber()
    {
        System.out.println("Enter five-digit number");
        Scanner in  = new Scanner (System.in);

        try
        {
            int number = in.nextInt();
            if(number < 10000 || number > 99999)
            {
                throw new InputMismatchException();
            }
            return number;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error data");
            return getNumber();
        }
    }

    public static void main(String[] args)
    {

        int number = getNumber();
        int[] numbers = new int[5];
        int i = 0; // int i = 4;
        int alter = reverse(number);
        // int save = number;
        System.out.println(number==alter? "Palindrome" : "Not Palindrome");
    }

    private static int reverse(int number)
    {
        int result = 0;
        while (number != 0)
        {
            // System.out.println(alter + "\t" + number%10);

            result = result*10+(number%10);

            // numbers[i++] = number%10; // numbers[i--] = number%10
            number /= 10;

        }
        return result;
    }

}
