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
public class media_de_3_numeros {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
         float val1, val2, val3, media;
         
         System.out.println("Calcular a média de 3");
         System.out.println("---------------------");
         System.out.println("Informe o primeiro valor:");
         val1= scanner.nextFloat();
         System.out.println("Informe o segundo valor:");
         val2= scanner.nextFloat();
         System.out.println("Informe o terceiro valor:");
         val3= scanner.nextFloat();
         
         media= (val1 + val2 + val3)/3;
         System.out.println("A média desses valores é " + media);
         
    }
    
}
