package exerciciosNet;

import java.util.Scanner;
public class Conta {
    static Scanner entrada = new Scanner(System.in);
    static String nome;
    static int idade=0, cpf=0,rg=0;
    public static void main(String[] args) {
        int opcao=0;

        System.out.println("Porfavor, digite o seu nome: ");
        nome = entrada.next();

        System.out.println("Digite o seu cpf");
        cpf = entrada.nextInt();

        System.out.println("Digite o seu rg");
        rg = entrada.nextInt();
        System.out.println("SEJA BEM VINDO AO ITAÚ " + nome);

        System.out.println("Aqui abaixo está as funções que vc pode fazer na sua conta");

        System.out.println("[1] - Sacar [2] - Depositar [3] - Verificar informações [4]-Excluir conta");
        opcao = entrada.nextInt();

        if(opcao==1)
        {
            System.out.println("Quantia sacada " + sacar());
        }else if(opcao==2)
        {
            depositar();
        }else if(opcao==3)
        {
            System.out.println(verificarInformacoes());
        }else
        {
            System.out.println(excluirConta());
        }

    }

    public static double sacar()
    {
        double quantConta=100;

        double quantSaque=0;
        System.out.println("Saldo R$100,00");

        System.out.println("Quanto vc deseja sacar ");
        quantSaque = entrada.nextDouble();

        while(quantSaque > quantConta)
        {
            System.out.println("Vc não pode sacar esse valor, digite outro valor");
            quantSaque = entrada.nextDouble();
        }

        System.out.println("Sacando....");

        return quantSaque;
    }

    public static void depositar()
    {
        double saldoAtual = 100;
        double quantDepositar = 0;

        System.out.println("Quanto vc deseja depositar");

        quantDepositar = entrada.nextDouble();

        saldoAtual += quantDepositar;

        System.out.println("Saldo atualizado R$ " + saldoAtual);
    }

    public static String verificarInformacoes()
    {
      return "Informações verificadas com sucesso.";
    }

    public static String excluirConta()
    {
        return "Excluindo conta com sucesso";
    }
}
