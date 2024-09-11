package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int n) {
        if (n < 0) 
            return false;

        int a = 0, b = 1;
        
        while (a <= n) {
            if (a == n)
                return true;
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número: ");
            int number = scanner.nextInt();
            
            if (isFibonacci(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
