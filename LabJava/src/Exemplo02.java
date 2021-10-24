import java.util.Scanner;
public class Exemplo02 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao=0;

        System.out.println("Digite a opção");
        opcao = entrada.nextInt();

        System.out.println("[1] - Adição");
        System.out.println("[2] - Substração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[5] - Sair");


        switch (opcao)
        {
            case 1:adicao();
            break;
            case 2:subtracao();
            break;
            case 3:multiplicacao();
            break;
            case 4:divisao();
            break;
            default:
                System.out.println("Opção inválida - tente novamente");
        }

    }

    public static void adicao()
    {
        int number=0;
        int number2=0;
        int conta=0;

        System.out.println("ADIÇÃO");

        System.out.println("Digite um numero");
        number = entrada.nextInt();
        System.out.println("Digite outro numero");
        number2 = entrada.nextInt();

        conta = number+number2;

        System.out.println("Resultado " + conta);
    }

    public static void subtracao()
    {
        int number=0;
        int number2=0;
        int conta=0;

        System.out.println("SUBTRAÇÃO");

        System.out.println("Digite um numero");
        number = entrada.nextInt();
        System.out.println("Digite outro numero");
        number2 = entrada.nextInt();

        conta=number-number2;
        System.out.println("Resultado " +conta);
    }


    public static void multiplicacao()
    {
        int number=0;
        int number2=0;
        int conta=0;

        System.out.println("MULTIPLICAÇÃO");

        System.out.println("Digite um numero");
        number = entrada.nextInt();
        System.out.println("Digite outro numero");
        number2 = entrada.nextInt();

        conta = number*number2;
        System.out.println("Resultado " +conta);
    }

    public static void divisao()
    {
        int number=0;
        int number2=0;
        int conta=0;

        System.out.println("DIVISÃO");

        System.out.println("Digite um numero");
        number = entrada.nextInt();
        System.out.println("Digite outro numero");
        number2 = entrada.nextInt();

        conta = number/number2;

        System.out.println("Resultado " +conta);

    }
}
