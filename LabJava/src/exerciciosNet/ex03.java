package exerciciosNet;

import java.util.Scanner;

public class ex03 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao=0;

        System.out.println("[1] - Descansar");
        System.out.println("[2] - Programar");
        System.out.println("[3] - Beber água");
        System.out.println("[4] - Sair do sistema");

        System.out.println("Digite uma opção");
        opcao = entrada.nextInt();

        while(opcao>5)
        {
            System.out.println("Digite um número válido");
            System.out.println("[1] - Descansar");
            System.out.println("[2] - Programar");
            System.out.println("[3] - Beber água");
            System.out.println("[4] - Sair do sistema");

        }

        if (opcao==1)
        {
            descansar();

        }else if(opcao==2)
        {
            programar();
        }else if(opcao==3)
        {
            beberAgua();
        }else
        {
            System.exit(0);
        }

    }

        public static void descansar()
        {
            int nivel=0;
            System.out.println("Digite o seu nivel de cansaço:");

            nivel = entrada.nextInt();

            if(nivel==1)
            {
                System.out.println("Recomendo dormir por 1 hora");
            }else if(nivel==2)
            {
                System.out.println("Recomendo dormir por 2 horas");
            }else if(nivel==3)
            {
                System.out.println("Recomendo dormir por 3 horas");
            }
        }

        public static void programar()
        {
            String linguaguem;

            System.out.println("Digite a linguagem que deseja programar");
            linguaguem = entrada.next();

            System.out.println("Vc está programando em " + linguaguem);

        }

        public static void beberAgua()
        {
            int litros=0;

            System.out.println("Digite a quantidade de litros que vc precisa beber hj");
            litros = entrada.nextInt();

            if(litros>2)
            {
                System.out.println("Recomendo vc tomar uma parte de manhã,tarde e noite ");

            }else{
                System.out.println("Vc pode tomar tudo direto agora kk");
            }
        }
}
