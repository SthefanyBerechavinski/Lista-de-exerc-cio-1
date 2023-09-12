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
public class maior_e_menor_numero {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        System.out.println("Mostrando o maior e o menor número! Por favor, insira os valores");
        System.out.println("Primeiro valor:");
        num1= scanner.nextInt();
        System.out.println("Segundo valor:");
        num2= scanner.nextInt();
        
        if (num1 > num2){
            System.out.println("O maior valor é: "+num1);
            System.out.println("O menor valor é: "+num2);
            
        }else if(num1 < num2){
            System.out.println("O maior valor é: "+num2);
            System.out.println("O menor valor é: "+num1);
        }
        
    }
    
}
