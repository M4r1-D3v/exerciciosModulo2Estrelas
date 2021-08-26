package br.com.zup;

import java.util.Scanner;

public class Lista002_Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do Produto 1: ");
        double produto1 = input.nextDouble();

        System.out.println("Por favor, digite o valor do Produto 2: ");
        double produto2 = input.nextDouble();

        System.out.println("Por favor, digite o valor do Produto 3: ");
        double produto3 = input.nextDouble();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("O produto 1 é o mais barato");

        } else if(produto2 < produto1 & produto2 < produto3){
            System.out.println(" O Produto 2 é o mais barato");

        }else {
            System.out.println("O produto 3 é o mais barato");
        }
    }
}
