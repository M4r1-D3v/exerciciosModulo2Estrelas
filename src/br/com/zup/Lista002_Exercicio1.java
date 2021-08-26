package br.com.zup;

import java.util.Scanner;

public class Lista002_Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número: ");
        double primeiroNumero = input.nextDouble();

        System.out.println("Por favor, digite o segundo número: ");
        double segundoNumero = input.nextDouble();

        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número é o maior");
        }else{
            System.out.println("O segundo número é o maior");
        }


    }
}
