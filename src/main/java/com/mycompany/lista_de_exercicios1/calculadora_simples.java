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
public class calculadora_simples {
    public static void main(String args[]){
        Scanner numero= new Scanner(System.in);
        int opcao;
        float num1, num2, resultado;
        
        System.out.println("Bem vindo a sua calculadora! Por favor, selecione uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao=numero.nextInt();
        
        if(opcao == 1){
            System.out.println("Primeiro número:");
            num1= numero.nextFloat();
            System.out.println("Segundo número:");
            num2= numero.nextFloat();
            resultado= num1 + num2;
            System.out.println("Resultado: " + resultado);
        }else if(opcao == 2){
            System.out.println("Primeiro número:");
            num1= numero.nextFloat();
            System.out.println("Segundo número:");
            num2= numero.nextFloat();
            resultado= num1 - num2;
            System.out.println("Resultado: " + resultado);
        }else if(opcao == 3){
            System.out.println("Primeiro número:");
            num1= numero.nextFloat();
            System.out.println("Segundo número:");
            num2= numero.nextFloat();
            resultado= num1 * num2;
            System.out.println("Resultado: " + resultado);
        }else if(opcao == 4){
            System.out.println("Primeiro número:");
            num1= numero.nextFloat();
            System.out.println("Segundo número:");
            num2= numero.nextFloat();
            resultado= num1 / num2;
            System.out.println("Resultado: " + resultado);
        
        }else {
            System.out.println("OPÇÃO INEXISTENTE");
        }
        
    }
    
}
