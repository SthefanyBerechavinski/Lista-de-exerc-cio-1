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
public class numero_par_ou_impar {
    public static void main(String args[]){
        Scanner numero= new Scanner(System.in);
        
        int num;
        Boolean par= true;
        
        System.out.println("Número par ou ímpar?");
        System.out.println("informe o número:");
        num= numero.nextInt();
        
        if( num % 2 == 0 ){
            par= true;
            System.out.println("Este número é PAR");
            
        }else{
            par= false;
            System.out.println("Este número é ÍMPAR");
            
        }
        
     
        
    }
    
}
