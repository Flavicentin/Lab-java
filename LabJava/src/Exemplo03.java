import java.util.Scanner;
public class Exemplo03 {

    //variáveis globais
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //Variável local
        int opcao=0;

        System.out.println("Digite um numero");
        int number = entrada.nextInt();
        System.out.println("Digite outro numero");
        int number2 = entrada.nextInt();


        System.out.println("Digite a opção");
        opcao = entrada.nextInt();

        System.out.println("[1] - Adição");
        System.out.println("[2] - Substração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[5] - Sair");


        switch (opcao)
        {
            case 1:adicao(number,number2);
                break;
            case 2:subtracao(number,number2);
                break;
            case 3:multiplicacao(number,number2);
                break;
            case 4:divisao(number,number2);
                break;
            default:
                System.out.println("Opção inválida - tente novamente");
        }

    }

    //parametros reais
    public static void adicao(int number, int number2)
    {
        int conta=0;

        System.out.println("ADIÇÃO");

        conta = number+number2;

        System.out.println("Resultado " + conta);
    }

    public static void subtracao(int number, int number2)
    {

        int conta=0;

        System.out.println("SUBTRAÇÃO");

        conta=number-number2;

        System.out.println("Resultado " +conta);
    }


    public static void multiplicacao(int number, int number2)
    {

        int conta=0;

        System.out.println("MULTIPLICAÇÃO");

        conta = number*number2;

        System.out.println("Resultado " +conta);
    }

    public static void divisao(int number, int number2)
    {

        int conta=0;

        System.out.println("DIVISÃO");

        conta = number/number2;

        System.out.println("Resultado " +conta);

    }
}
