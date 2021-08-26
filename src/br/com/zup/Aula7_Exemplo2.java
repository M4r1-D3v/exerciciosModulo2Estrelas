package br.com.zup;

//importando o Scanner
import java.util.Scanner;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Ex. para receber o nome do usuário
        System.out.println("Por favor digite o seu nome de usuário ");
        String nomeDoUsuario = leitor.next();
    }

}
