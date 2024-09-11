package com.mycompany.contadorletraa;

import java.util.Scanner;

public class ContadorLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe uma String: ");
        String input = scanner.nextLine();
        
        int contador = 0;
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == 'a' || c == 'A')
                contador++;
        }
        
        if(contador > 0)
            System.out.println("A letra 'a', maiúscula ou minúscula, aparece " + contador + " vezes na String");
        else
            System.out.println("A letra 'a', maiúscula ou minúscula, não aparece na String");
    }
    
}
