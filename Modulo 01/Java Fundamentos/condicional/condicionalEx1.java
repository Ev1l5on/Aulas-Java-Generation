package condicional;

import java.util.Scanner;

/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class condicionalEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, maiorNum=0, i;
		
		System.out.println("Digite os trés numeros ");
		
		
	for (i= 0 ; i<=2 ; i++) 
	{
		numero = sc.nextInt();
		
		if (maiorNum<numero) 
		{
			maiorNum =  numero;		
		}
		
	}
	
		System.out.println("O maior número digitado é :" + maiorNum);
		
		sc.close();
	

	}
}
