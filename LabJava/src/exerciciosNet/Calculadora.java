package exerciciosNet;

import java.util.Scanner;
public class Calculadora {
    //Para fazer com que todas os métodos possam usar o Scanner
    static Scanner entrada  = new Scanner(System.in);
    public static void main(String[] args) {

        int numero=0,numero2=0,opcao=0;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println("Digite outro numero");
        numero2 = entrada.nextInt();

        System.out.println("MENU");
        System.out.println("O que deseja fazer com esses numeros: ");
        System.out.println("1-[SOMAR]");
        System.out.println("2-[MULTIPLICAR]");
        System.out.println("3-[DÍVIDIR]");
        System.out.println("4-[SUBTRAÇÃO]");
        opcao = entrada.nextInt();
        if(opcao==1)
        {
            somar(numero,numero2);
        }else if(opcao==2)
        {
            multiplicar(numero,numero2);
        }else if(opcao==3)
        {
            dividir(numero,numero2);
        }else
        {
            subtracao(numero,numero2);
        }

    }


    public static void somar(int numero, int numero2)
    {
        int conta = 0;

        conta = numero+numero2;

        System.out.println("Resultado: " + conta);
    }

    public static void multiplicar(int numero,int numero2)
    {
        int conta=0;

        conta  = numero*numero2;
        System.out.println("Resultado: " + conta);
    }

    public static void dividir(int numero, int numero2)
    {
        int conta =0;

        conta  = numero/numero2;
        System.out.println("Resultado: " + conta);
    }

    public static void subtracao(int numero,int numero2)
    {
        int conta =0;

        conta = numero - numero2;
        System.out.println("Resultado: " + conta);
    }
}
