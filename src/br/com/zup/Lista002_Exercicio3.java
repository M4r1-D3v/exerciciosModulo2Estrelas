package br.com.zup;

import java.util.Scanner;

public class Lista002_Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite a Nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Por favor, digite a Nota 2: ");
        double nota2 = input.nextDouble();

        double mediaNotas = (nota1 + nota2)/2;

        if (mediaNotas >=7 & mediaNotas < 10){
            System.out.println("Aprovado");

        }else if (mediaNotas <7 ){
            System.out.println("Reprovado");
        }else if (mediaNotas == 10){
            System.out.println("Aprovado com distinção");

        }
    }
}
