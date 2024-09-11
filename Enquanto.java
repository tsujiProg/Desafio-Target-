package com.mycompany.enquanto;

public class Enquanto {

    public static void main(String[] args) {
        
        int INDICE = 12, SOMA = 0, K = 1;
        
        while(K < INDICE){
            K++;
            SOMA += K;
        }
        
        System.out.println("O valor da variável SOMA é de: " + SOMA);
        
    }
    
}
