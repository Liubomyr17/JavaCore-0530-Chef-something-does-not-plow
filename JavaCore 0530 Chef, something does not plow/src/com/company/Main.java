package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0529 Консоль-копилка
Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна корректно работать,
если пользователь ввел одно число и слово «сумма».
3. Программа должна корректно работать,
если пользователь ввел два числа число и слово «сумма».
4. Программа должна корректно работать,
если пользователь ввел более двух чисел и слово «сумма».
5. Программа должна выводить текст на экран.
6. Программа должна прекращать считывать данные с клавиатуры
после того пользователь введет слово "сумма" и нажмет Enter.

*/

// public class Solution
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());

       int sum = a + b;
       System.out.println("Sum = " + sum);
    }
    
}







