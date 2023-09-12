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
public class soma_de_dois_numeros {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        float num1, num2, resultado;
        
        String opcao;
        
        Boolean continuar= true;
        while(continuar){
        
            System.out.println("Calculadora de somas");
            
            System.out.println("Informe o primeiro número:");
            num1= scanner.nextFloat();
            
            System.out.println("Informe o segundo número:");
            num2 = scanner.nextFloat();
            
            resultado= num1 + num2;
            System.out.println("O resultado é " + resultado);

            System.out.println("Deseja realizar mais uma operação? (S/N)");
            opcao= scanner.next();

            if(opcao.equals("S") || opcao.equals("s")){
                continuar= true;
            }else{
                continuar= false;
        }
        
        }
    
    }
    
}
