package Exercicios;

import java.util.Scanner;
public class ex01 {
    static Scanner entrada = new Scanner(System.in);
    static String nomeHospede;
    public static void main(String[] args) {
        int tipoAcomodacao=0;
        int quantidadeDiarias=0;
        String opcao;

        System.out.println("Digite o seu nome");
        nomeHospede = entrada.next();

        System.out.println("Digite o tipo de acomodação");
        tipoAcomodacao = entrada.nextInt();

        System.out.println("Digite a quantidade de diárias");
        quantidadeDiarias = entrada.nextInt();

        System.out.println(pousadaBeiraMar(tipoAcomodacao,quantidadeDiarias));


        System.out.println("Digite a forma de pagamento");
        System.out.println("[V]-A Vista [F]-Pagamento a prazo 10% de desconto");
        opcao = entrada.next();

        int pagamento  = pousadaBeiraMar(tipoAcomodacao,quantidadeDiarias);

        pagamento(opcao,pagamento);
    }

    public static int pousadaBeiraMar(int tipoAcomodacao,int quantidadeDiarias)
    {

        int valorFinal=0;
        if(tipoAcomodacao == 1)
        {
            System.out.println("Voce escolheu a Standard");
            System.out.println("Valor da diária R$380,00");
            valorFinal = 380*quantidadeDiarias;
            System.out.println("Valor total: " + valorFinal);
        }else if(tipoAcomodacao == 2)
        {
            System.out.println("Voce escolheu o tipo de acomodação de Luxo");
            System.out.println("Valor da diária R$450,00");
            valorFinal = 450*quantidadeDiarias;
            System.out.println("Valor total: " + valorFinal);
        }else
        {
            System.out.println("Voce escolheu o tipo de acomodação de SUper Luxo");
            System.out.println("Valor da diária R$560,00");
            valorFinal = 560*quantidadeDiarias;
            System.out.println("Valor total: " + valorFinal);
        }

        return valorFinal;
    }

    public static void pagamento(String opcao, int valorFinal)
    {
        double valorComDesconto=0;
        if(opcao.equalsIgnoreCase("v"))
        {
            System.out.println("Pagamento a vista");
            valorComDesconto = valorFinal;

        }else
        {
            System.out.println("Pagamento a prazo com 10% de desconto");

            valorComDesconto = valorFinal + (10/100 * valorFinal);

            System.out.println("R$ " + valorComDesconto);
        }
    }
}
