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
public class calendario_simples {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        
        int mes, ano;
        int jan=31, fev=28, mar=31, abr=30, mai=31, jun=30, jul=31, ago=31, set=30, out=31, nov=30, dez=31;
        
        System.out.println("Calendário simples");
        System.out.println("Qual mês você deseja? (1 à 12)");
        mes= scanner.nextInt();
        System.out.println("Qual ano?");
        ano= scanner.nextInt();
        
        if(mes == 1){
            System.out.println("O mês de Janeiro de " + ano + " tem " + jan + " dias");
        }else if(mes == 2){
            System.out.println("O mês de Fevereiro de " + ano + " tem " + fev + " dias");
        }else if(mes == 3){
            System.out.println("O mês de Março de " + ano + " tem " + mar + " dias");
        }else if(mes == 4){
            System.out.println("O mês de Abril de " + ano + " tem " + abr + " dias");
        }else if(mes == 5){
            System.out.println("O mês de Maio de " + ano + " tem " + mai + " dias");
        }else if(mes == 6){
            System.out.println("O mês de Junho de " + ano + " tem " + jun + " dias");
        }else if(mes == 7){
            System.out.println("O mês de Julho de " + ano + " tem " + jul + " dias");
        }else if(mes == 8){
            System.out.println("O mês de Agosto de " + ano + " tem " + ago + " dias");
        }else if(mes == 9){
            System.out.println("O mês de Setembro de " + ano + " tem " + set + " dias");
        }else if(mes == 10){
            System.out.println("O mês de Outubro de " + ano + " tem " + out + " dias");
        }else if(mes == 11){
            System.out.println("O mês de Novembro de " + ano + " tem " + nov + " dias");
        }else if(mes == 12){
            System.out.println("O mês de Dezembro de " + ano + " tem " + dez + " dias");
        }
    }
    
}
