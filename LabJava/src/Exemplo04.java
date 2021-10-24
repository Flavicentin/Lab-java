import java.util.Scanner;

public class Exemplo04 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double nota1=0;
        double nota2=0;
        double media=0;
        String aluno;
        System.out.println("Digite nota 1:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite nota 2:");
        nota2 = entrada.nextDouble();


        media = calculaMedia(nota1,nota2);

        System.out.println("Média: " + media);

        aluno=verificaAprovacao(media);
        System.out.println("Status do aluno: " + aluno);
    }

    public static double calculaMedia(double nota1,double nota2)
    {
        double conta=0;

        conta = nota1+nota2/2;

        return conta;
    }

    public static String verificaAprovacao(double media)
    {

        String verifica;
        if(media >= 6)
        {
            verifica = "Aprovado";
        }else
        {
            verifica = "Reprovado";
        }

        return verifica;
    }
}
