package exerc�cio8;

import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */
public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cc, cf;
		System.out.println("Digite o custo do fabricante : ");
		cf = sc.nextDouble();
		
		cc = (cf * 1.73); //a multipica��o j� da o valor do custo!
		
		System.out.println("O custo para o consumidor � de : "+cc);
		
		sc.close();
				
				
		
	}

}
