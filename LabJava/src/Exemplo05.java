import java.util.Scanner;
public class Exemplo05 {
    static Scanner entrada = new Scanner(System.in);
    static String nome;
    //Função funcionário que chama o verifica
    public static double funcionario()
    {

        double valorHora=0,salario=0;
        int horasTrabalhadas;


        System.out.println("Digite o nome");
        nome = entrada.next();

        System.out.println("Digite o valor hora: ");
        valorHora = entrada.nextDouble();
        System.out.println("Digite horas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();

        salario = valorHora*horasTrabalhadas;

        return salario;
    }

    public static void verificar(double salario)
    {
        String msg;
        if(salario>1000)
        {
            msg = "Ta ganhando muito, vai pagar imposto.";
        }else
        {
            System.out.println("Direito ao aumento");
        }

        System.out.println("Funcionário: " + nome);
    }
    public static void main(String[] args) {


        //System.out.println(funcionario());
        // ou
        double salario = funcionario();
        verificar(salario);


    }
}
