package br.com.zup;
import java.util.Scanner;

public class ListaExtra_Ex1_Scanner {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);
        double pesoMaximo = 50;
        double pesoDoPeixe;
        System.out.println(" Por favor digite o peso do peixe: ");
        pesoDoPeixe = obj_leitor.nextDouble();

        double excessoDePeso = pesoDoPeixe - pesoMaximo;
        double multa = excessoDePeso * 4;


        System.out.println("Vou calcular o valor da multa por excesso de peso para você");

        System.out.println(" O valor da multa é:" + "R$" + multa);
    }
}
