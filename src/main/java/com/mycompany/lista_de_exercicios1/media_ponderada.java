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
public class media_ponderada {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        float n1, n2, n3, medPond;
        int p1, p2, p3;
        
        System.out.println("Calcule sua média ponderada aqui!");
        System.out.println("Informe suas respectivas notas:");
        n1= scanner.nextFloat();
        n2= scanner.nextFloat();
        n3= scanner.nextFloat();
        System.out.println("Agora informe os respectivos pesos de cada nota:");
        p1= scanner.nextInt();
        p2= scanner.nextInt();
        p3= scanner.nextInt();
        
        medPond= (p1*n1 + p2*n2 + p3*n3) / (p1 + p2 + p3);
        System.out.println("Sua média ponderada é " + medPond);
        
        
        
        
        
    }
    
}
