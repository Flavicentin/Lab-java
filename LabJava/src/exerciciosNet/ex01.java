package exerciciosNet;

import java.util.Scanner;
public class ex01 {

    static Scanner entrada = new Scanner(System.in);//Significa que todos os métodos podem acessar a entrada
    public static void main(String[] args) {
        int numero;

        System.out.println("Digite um valor");
        numero = entrada.nextInt();

        armazenarValorVetor(numero);
    }

    public static void armazenarValorVetor(int numero)
    {
        int vetor[] = new int[3];

        for (int i=0;i<3;i++)
        {
            vetor[i] = numero;
            System.out.println(vetor[i]);
        }


    }
}
