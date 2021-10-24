package Exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ex06 {
	static DecimalFormat fPorc = new DecimalFormat("#,##0.00%");

	//global/publico
	static String [] revistas = new String [] {"Veja", "Quatro Rodas","Voc� S/A"};
	static String [] estados = new String [] {"S�o Paulo","Minas Gerais","Rio de Janeiro","Espirito Santos"};	
	static Scanner entrada = new Scanner(System.in);

	static int totalMatriz=0;
	
	public static void main(String[] args) {
		
		int matriz[][] = carregar();
			
		//A)
		letraA(matriz);
		//B)
		int somaEstado[] = letraB(matriz);
		exibirB(somaEstado);
		//C)
		letraC(matriz);
		//D)
		double[] valoresEstados = letraD(matriz);
		System.out.println("");
		System.out.println("Letra D");
		for (int i=0;i<4;i++){
			System.out.println(estados[i] + " : " + valoresEstados[i]);
		}
	}
	
	public static int [][] carregar (){
		
		int matriz[][] = new int [4][3];
		
		for(int e=0;e<4;e++) {
			System.out.println(estados[e]);
			
			for(int r=0;r<3;r++) {
				System.out.println("Revista "+revistas[r]+":");
			
				matriz[e][r]=entrada.nextInt();

				//Para ter a soma geral da matriz
				totalMatriz+=matriz[e][r];
			}

		}
		return matriz;
	}

	public static void letraA(int matriz[][])
	{
		int somaRevista=0;
		double perc=0;

		for(int r=0;r<3;r++) {//fixa
			somaRevista = 0;
			for (int e=0;e<4;e++){//movimenta
				somaRevista += matriz[e][r];

			}


			perc = (double) somaRevista/totalMatriz;

			System.out.println(perc);
			System.out.println(revistas[r] + " : " + fPorc.format(perc));
		}
	}

	public static int[] letraB(int matriz[][])
	{
		int somaEstado[] = new int[4];

		for (int e=0;e<4;e++)
		{
			for (int r=0;r<3;r++){

				somaEstado[e] += matriz[e][r];
			}
		}
		return somaEstado;
	}

	public static void exibirB(int somaEstado[])
	{
		int maior=0,menor=0,indMaior=0,indMenor=0;
		for(int i =0;i<4;i++){

			if(i==0){
				menor = somaEstado[i];
				indMenor = i;
			}else {
				if (somaEstado[i] > maior) {
					maior = somaEstado[i];
					indMaior = i;
				}
				if (somaEstado[i] < menor) {
					menor = somaEstado[i];
					indMenor = i;
				}
			}
		}
		System.out.println("");
		System.out.println("Estado com melhor venda " + estados[indMaior]);
		System.out.println("Estado com menor venda " + estados[indMenor]);
	}

	public static void letraC(int matriz[][]){

		int maior=0,indMaior=0;
		for (int e=0;e<4;e++){
			maior=0;
			for (int r=0;r<3;r++){

				if(matriz[e][r] > maior){
					maior=matriz[e][r];
					indMaior = r;
				}
			}
			System.out.println("Estados "+ estados[e] +" : " +revistas[indMaior]);
		}

	}

	public static double[] letraD(int matriz[][]){

		double [] valorEstados = new double[4];
		double [] preco = new double[] {10,14,12};

		for (int e=0;e<4;e++){
			for (int r=0;r<3;r++){
				valorEstados[e] += matriz[e][r]*preco[r];
			}
		}
		return valorEstados;
	}
}
