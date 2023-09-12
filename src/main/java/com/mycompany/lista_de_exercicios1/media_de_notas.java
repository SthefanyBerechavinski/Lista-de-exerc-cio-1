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
public class media_de_notas {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        int num1, num2, num3, num4, media;
        
        System.out.println("Calcule a média de suas notas no sistema bimestral.");
        System.out.println("Insira suas respectivas notas de cada bimestre:");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();
        num4= scanner.nextInt();
        
        media= (num1 + num2 + num3 + num4)/4;
        
        if(media >= 70){
            System.out.println("Sua média é " + media + ". PARÁBENS, você foi APROVADO!!");
        }else if(media < 70){
            System.out.println("Sua média é " + media + ". Você foi REPROVADO!!");
        }
        
        
    
    }
    
}
