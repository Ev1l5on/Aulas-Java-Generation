package convertDias;

import java.util.Scanner;

/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias
/ *  e mostre-a expressa em anos, meses e dias.*/
public class convertDias {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dias, anos, meses,idade;
		
		System.out.println("\n Digite seus dias de vida; ");
		idade = ler.nextInt();
		
		anos = (idade/365);
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		
		System.out.println("\n Sua idade �; "+ anos);
		System.out.println("\n Sua meses �; "+ meses);
		System.out.println("\n Sua dias �; "+ dias);
		
		ler.close();
		
		
		

	}

}
