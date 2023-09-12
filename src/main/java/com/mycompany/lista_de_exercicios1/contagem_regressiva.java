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
public class contagem_regressiva {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        int numero;
        
        System.out.println("Contagem regressiva! Por favor inicie a contagem.");
        numero= scanner.nextInt();
        while(numero>=0){
            System.out.println(numero);
            numero= numero-1;
        
        }System.out.println("Contagem encerrada!");
    }
    
}
