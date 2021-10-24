package exerciciosNet;

import java.util.Scanner;

public class ex04 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao=0;
        System.out.println("Bem vindo ao mercado/padaria MARENGO");

        System.out.println("MENU");
        System.out.println("[1] - REFRIGERANTE - R$2,50");
        System.out.println("[2] - ARROZ - $3,00");
        System.out.println("[3] - FEIJÃO - $3,10");

        System.out.println("O que deseja comprar");
        opcao = entrada.nextInt();

        compra(opcao);
    }

    public static void compra(int opcao)
    {
        int quantidade=0;
        double conta;
        if(opcao ==1)
        {
            System.out.println("Digite a quantidade de refrigerantes que deseja comprar");
            quantidade = entrada.nextInt();

            conta = quantidade * 2.50;

            System.out.println("Preço: " + conta);
        }else if(opcao==2)
        {
            System.out.println("Digite a quantidade de arroz que deseja comprar");

            quantidade = entrada.nextInt();

            conta = quantidade * 3.00;

            System.out.println("Preço: " + conta);
        }else if(opcao==3)
        {
            System.out.println("Digite a quantidade de feijões que deseja comprar");
            quantidade = entrada.nextInt();

            conta = quantidade * 3.10;

            System.out.println("Preço: " + conta);
        }
    }
}

