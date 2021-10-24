import java.util.Scanner;

public class Exemplo01 {

    //Sempre vai ser assim
    //public static tipo da variável de retorno Nome da função(Parâmetro)

    static Scanner entrada = new Scanner(System.in);//significa que pode ser acessado por outros métodos
    public static void main(String[] args) {

        verificar();

    }

    //Procedimento
    public static void verificar()
    {
        int numero=0;
        System.out.println("Digite um numero:");

        numero = entrada.nextInt();

        if(numero%2==1)
        {
            System.out.println("Esse numero é impar");
        }else
        {
            System.out.println("Par");
        }
    }
}
