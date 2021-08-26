package br.com.zup;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {

    // Variaveis de entrada
    double pesoDosPeixes = 60;

    //Variaveis de processamento
    double kg_MaximoPermitido = 50;
    double valorDaMulta = 4.0;

    //Variaveis de resposta
    double kg_excedente = pesoDosPeixes - kg_MaximoPermitido;
    double valorDaMultaASerPaga;

    //Processando a quantidade de kg excedente e valor da multa

        kg_excedente = pesoDosPeixes - kg_excedente;
        valorDaMultaASerPaga = kg_excedente * valorDaMulta;

        System.out.println(" Kg lido na balança " + pesoDosPeixes + " kg");
        System.out.println("O permitido pelo Estado era: " + kg_MaximoPermitido + " kg");
        System.out.println("O valor atual da multa é: " + " R$ " + valorDaMulta);



            }
}
