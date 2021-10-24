package exerciciosNet;

import java.util.Scanner;
public class ex02 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String nome;
        System.out.println("Digite o seu nome");
        nome = entrada.next();

        System.out.println(mostrarNome(nome));
    }

    public static String mostrarNome(String nome)
    {
        return nome;
    }
}
