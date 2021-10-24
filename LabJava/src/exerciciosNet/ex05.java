package exerciciosNet;

import java.util.Scanner;


public class ex05 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int carros=0;
        System.out.println("AUTOMÓVEIS");

        System.out.println("Quantos carros chegaram hj");
        carros = entrada.nextInt();

        controleCarros(carros);
    }

    public static void controleCarros(int carros)
    {
        if(carros>5)
        {
            System.out.println("Coloque eles na outra garaem de baixo");
        }
    }

}
