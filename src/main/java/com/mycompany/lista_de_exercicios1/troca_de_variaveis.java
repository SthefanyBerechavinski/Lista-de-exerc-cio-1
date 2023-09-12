/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios1;

import java.util.Scanner;

/**
 *
 * @author sthefany.1921
 */
public class troca_de_variaveis {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int a, b, temp;
        
        System.out.println("Troca de variáveis. Insira os valores:");
        System.out.println("Valor 1:");
        a= scanner.nextInt();
        System.out.println("Valor 2:");
        b= scanner.nextInt();
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Agora o valor 1 é " + a +". E o valor 2 é " + b + ".");
        
        
        
        
        
        
        
        
    
    
        
    
    }
    
}
