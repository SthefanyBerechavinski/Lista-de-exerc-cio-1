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
public class percentual_de_numero {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        float valor, percent, result;
        
        System.out.println("Informe o número:");
        valor= scanner.nextFloat();
        System.out.println("Qual percentual você deseja tirar deste valor?");
        percent= scanner.nextFloat();
        
        result=(valor * percent) / 100;
        System.out.println( percent + "% de " + valor + " é " + result);
        
        
       
    }
    
}
