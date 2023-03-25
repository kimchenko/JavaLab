package com.company;

//"Палиндром"
//        Программа должна в качестве входных данных, принимать пятизначные числа и определять, является ли введенное пятизначное число палиндромом.
//        Палиндром — это число или текст (набор символов), который читается одинаково и слева, и справа: 939; 49094; 11311.
//        Научитесь пользоваться операцией — остаток от деления, тогда легко найдете способ решения данной задачи.
//        Нельзя использовать метод StringBuffer.reverse() и подобные методы.
//        -----Пример работы программы №1:
//        Введите пятизначное число:  54045
//        Это число палиндром

import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println("Enter five-digit number");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = "";
        int number = 0;
        try
    {
        number = Integer.parseInt(a);
    }
    catch(NumberFormatException e)
        {
            System.out.println("Error");
            return;
        }
        while (number != 0)
        {
            b += number%10;
            number /= 10;
        }
        // System.out.println(b);
        if (a.equals(b))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");










        /*int a;
        System.out.println("Enter five-digit number");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        int b = a;
        int c = 0;

        while(a/1 != 0)
        {
            c*=10;
            c+=a%10;
            a/=10;
        }
        System.out.println(b==c);
*/



        /*boolean p = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != a[a.length - i - 1]) {
                p = false;
                System.out.println("Это не палиндром");
            } else
                System.out.println("Палиндром");

        }*/

    }
}
