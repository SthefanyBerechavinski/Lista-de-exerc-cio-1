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
public class calcular_IMC {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        float p,a,imc;
        
        System.out.println("Calculadora de IMC");
        System.out.println("Por favor informe seu peso:");
        p= scanner.nextFloat();
        System.out.println("Por favor informe sua altura");
        a= scanner.nextFloat();
        
        imc= p /(a*a);
        System.out.println("Seu IMC é igual a " +imc);
        
    }
    
}
