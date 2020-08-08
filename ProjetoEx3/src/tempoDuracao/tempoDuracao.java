package tempoDuracao;

import java.util.Scanner;

/*
/* 3. Faça um sistema que leia o tempo de duração de 
 * um evento em uma fábricaexpressa em segundos e mostre-o
 *  expresso em horas, minutos e segundos.
 */
public class tempoDuracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seg, hr, min, tempo;
		System.out.println("Digite o tempo de duração: ");
		tempo = sc.nextInt();
		
		hr = (tempo/3600);
		min = (tempo%3600)/60;
		seg = (tempo%3600)%60;
		
		System.out.printf("\nHoras : %d",hr);
		System.out.printf("\nMinutos : %d",min);
		System.out.printf("\nSegundo: %d",seg);
		
	sc.close();
		

	}

}
