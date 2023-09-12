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
public class tabuada {
    public static void main(String args[]){
        Scanner numero= new Scanner(System.in);
        
        int numTab, mult;
        
        System.out.println("Tabuada de 1 á 10. De qual número você deseja ver a tabuada?");
        numTab= numero.nextInt();
        
        System.out.println ("Tabuada do "+ numTab);
        for( int i = 1; i<=10; i++){ 
            mult= numTab * i; 
            System.out.println (numTab+" x "+i+" = "+ mult);
        }
                
    }
    
}
