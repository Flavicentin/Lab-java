package Exercicios;

import java.util.Scanner;
public class ex02 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SEJA BEM VINDO A TRANSPORTADORA EXPRESS");

    }

    public void codCaminhao()
    {
        int codCaminhao=0;


        System.out.println("Digite o código do caminhão: ");
        codCaminhao = entrada.nextInt();

        double precoCargaCaminhao=0;

        System.out.println("Digite o preço por Quilo da carga do caminhão");
        precoCargaCaminhao = entrada.nextDouble();

        if(codCaminhao <=10)
        {
            System.out.println("A ");
        }
    }
}
