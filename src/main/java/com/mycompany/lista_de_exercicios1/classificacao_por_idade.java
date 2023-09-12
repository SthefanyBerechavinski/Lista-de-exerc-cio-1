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
public class classificacao_por_idade {
    public static void main (String args[]){
        Scanner scanner= new Scanner(System.in);
        
        int idade;
        
        System.out.println("Classificação dos atletas por categoria de idade.");
        System.out.println("Qual a idade do atleta?");
        idade= scanner.nextInt();
        
        if((idade >= 5) && (idade <=7)){
            System.out.println("A categoria do atleta é Infantil A");
        }else if((idade>=8) && (idade<=10)){
            System.out.println("A categoria do atleta é Infantil B");
        }else if((idade>=11) && (idade<=13)){
            System.out.println("A categoria do atleta é Juvenil A");
        }else if((idade>=14) && (idade<=17)){
            System.out.println("A categoria do atleta é Juvenil B");
        }else if (idade>=18){
            System.out.println("A categoria do atleta é Adulto");
        }
    }
    
}
