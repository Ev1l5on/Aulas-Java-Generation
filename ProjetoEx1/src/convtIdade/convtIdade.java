package convtIdade;

import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de uma 
 * pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */
public class convtIdade {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, dias, meses, anos;
		
		System.out.printf("Digite a idade : ");
		anos = ler.nextInt();
		System.out.printf("Digite os meses : ");
		meses = ler.nextInt();
		System.out.printf("Digite os dias : ");
		dias = ler.nextInt();
		
		idade = (anos * 365) + (meses * 30) + (dias);
		
		System.out.printf("\n Seus dias de vida foi: %d ", idade);
		ler.close();
	 }
	
	}