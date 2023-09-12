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
public class sistema_basico_de_vendas {
    public static void main (String args[]){
        Scanner entrada= new Scanner(System.in);
        
        String prodA = "Bola";
        String prodB = "Raquete";
        String prodC = "Patins";
        String prodD = "Peteca";
        String prodE = "Boneca";
                
       
        int quant, produto;
        float resultado;
        float valProdA = (float) 10;
        float valProdB = (float) 15.5;
        float valProdC = (float) 30;
        float valProdD = (float) 4;
        float valProdE = (float) 15;
        
        System.out.println("Sistema de vendas.");
        System.out.println("Selecione o número do produto desejado");
        System.out.println(" -------------------------");
        System.out.println("| 1. " + prodA +" - " + valProdA);
        System.out.println("| 2. " + prodB +" - " + valProdB);
        System.out.println("| 3. " + prodC +" - " + valProdC);
        System.out.println("| 4. " + prodD +" - " + valProdD);
        System.out.println("| 5. " + prodE +" - " + valProdE);
        System.out.println(" -------------------------");
        produto=entrada.nextInt();
        
        System.out.println("Que quantidade do produto selecionado você deseja?");
        quant=entrada.nextInt();
        
        if(produto == 1){
            resultado= valProdA * quant;
            System.out.println("O preço total é R$" + resultado);
        }else if(produto == 2){
            resultado= valProdB * quant;
            System.out.println("O preço total é R$" + resultado);
        }else if(produto == 3){
            resultado= valProdC * quant;
            System.out.println("O preço total é R$" + resultado);
        }else if(produto == 4){
            resultado= valProdD * quant;
            System.out.println("O preço total é R$" + resultado);
        }else if (produto == 5){
            resultado= valProdE * quant;
            System.out.println("O preço total é R$" + resultado);
        } 
        
        
        
        
        
        
        
        
        
        
    }
    
}
