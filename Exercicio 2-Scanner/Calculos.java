package com.mycompany.calculos;
//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class Calculos {
    public static void main(String[] args) {
        //Para variáveis
         Scanner scanner =new Scanner(System.in);
        //Leitura primero número
         double numero=scanner.nextDouble();
        //Leitura segundo número
         double numero2 =scanner.nextDouble();
        //Cálculos
         double soma= numero+numero2;
         double subtracao= numero-numero2;
         double multiplicacao= numero*numero2;
         double divisao= numero/numero2;
    
        //Exibição do resultado
         System.out.println("A soma e:" +soma);
         System.out.println("A divisao e:" +subtracao);
         System.out.println("A multiplicacao e:" +multiplicacao);
         System.out.println("A divisao e:" +divisao);
         
         scanner.close();
    }
}