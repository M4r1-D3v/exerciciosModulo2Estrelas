package br.com.zup;

import java.util.Scanner;

public class Lista002_Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do seu salário: ");
        double salario = input.nextDouble();
        double aumento20 = (salario * 20/100);
        double aumento15 = (salario * 15/100);
        double aumento10 = (salario * 10/100);
        double aumento5 = (salario * 5/100);
        double salarioReajustado20 = salario + aumento20;
        double salarioReajustado15 = salario + aumento15;
        double salarioReajustado10 = salario + aumento10;
        double salarioReajustado5 = salario + aumento5;

        if (salario <= 280 & salario >0){
            System.out.println("Você receberá um aumento de 20%, que corresponde a R$ " + aumento20);
            System.out.println("O seu salário antes do reajuste era de R$ " + salario + ","  + "agora passou a ser com o reajuste R$: " +  salarioReajustado20 );
        } else if (salario > 280 & salario <= 700){
            System.out.println("Você receberá um aumento de 15%, que corresponde a R$ " + aumento15 );
            System.out.println("O seu salário antes do reajuste era de R$ " + salario + ","  + "agora passou a ser com o reajuste R$: " +  salarioReajustado15 );
        } else if (salario >700 & salario <= 1500){
            System.out.println("Você receberá um aumento de 10%, que corresponde a R$ " + aumento10 );
            System.out.println("O seu salário antes do reajuste era de R$ " + salario + ","  + "agora passou a ser com o reajuste R$: " +  salarioReajustado10 );
        }else if (salario > 1500){
            System.out.println("Você receberá um aumento de 5%, o que corresponde a R$ " + aumento5);
            System.out.println("O seu salário antes do reajuste era de R$ " + salario + ","  + "agora passou a ser com o reajuste R$: " +  salarioReajustado5 );
        } else{
            System.out.println("Valor inválido");
        }
    }
}
