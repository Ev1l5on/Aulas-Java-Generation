package condicional;

import java.util.Scanner;

/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class condicionalEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, maiorNum=0, i;
		
		System.out.println("Digite os tr�s numeros ");
		
		
	for (i= 0 ; i<=2 ; i++) 
	{
		numero = sc.nextInt();
		
		if (maiorNum<numero) 
		{
			maiorNum =  numero;		
		}
		
	}
	
		System.out.println("O maior n�mero digitado � :" + maiorNum);
		
		sc.close();
	

	}
}
