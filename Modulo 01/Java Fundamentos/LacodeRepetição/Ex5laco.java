package LacodeRepeti��o;
/* Crie um programa que leia um n�mero do teclado at� que encontre um
   n�mero igual a zero. No final, mostre a soma dos n�meros
   digitados.(DO...WHILE)*/
import java.util.*;

public class Ex5laco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero,soma=0;
		
		do {
			System.out.println("Digite os numeros");
			numero = sc.nextInt();
			
			soma = soma + numero;
			
			
		}
		while(numero !=0);
		
		System.out.println(" A soma dos numeros �" + soma);
		sc.close();
	}
	
}

