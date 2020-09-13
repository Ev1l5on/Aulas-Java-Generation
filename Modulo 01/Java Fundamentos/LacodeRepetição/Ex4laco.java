package LacodeRepetição;

import java.util.Scanner;

/*
  Uma empresa desenvolveu uma pesquisa para saber as características
  psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
  era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
  agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
  pessoas, calcule e mostre: (WHILE)
  o número de pessoas calmas;
  o número de mulheres nervosas;
  o número de homens agressivos;
  o número de outros calmos;
  o número de pessoas nervosas com mais de 40 anos;
  o número de pessoas calmas com menos de 18 anos.
 */

public class Ex4laco {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int idade=0,sexo=0, estadoM=0, pCalmas=0, mNervosas=0, hAgressivos=0, outrosC=0, nervoso40=0, calmos18=0;
		
		
		System.out.println("Digite sua idade : ");
		System.out.println("Digite seu sexo (1-feminino / 2-masculino / 3-Outros) : ");
		System.out.println("Digite (1 para pessoa calma, 2 para pessoa nervosa e 3 para pessoa agressiva) : ");
		System.out.println("Digite 9 sair : ");
		
		while(idade != -99) 
		{
			System.out.println("Digite sua idade ; ");
			idade=sc.nextInt();
			System.out.println("Digite 1-Para feminino, 2-Para masculino, 3-Para outros ; ");
			sexo=sc.nextInt();
			System.out.println("Digite 1-Para calmo, 2-Para nervosos, 3-Para agressivo ; ");
			estadoM=sc.nextInt();
			
			if(estadoM ==1) {
				pCalmas++;
				
			if(sexo==3) {
					outrosC++;
				}
			if(idade < 18) {
				calmos18++;
				}
			}
			else if(estadoM ==2) {
				if(sexo==1) {
					mNervosas++;
				
				if(idade > 40) {
					nervoso40++;
				}
				
			}
				else if(estadoM ==3 && sexo ==2) {
					hAgressivos++;
				}
			}
			System.out.println("-- Informações Pesquisa -- ");
			System.out.println("Número de pessoas calmas: "+pCalmas);
			System.out.println("Número de mulheres nervosas: "+mNervosas);
			System.out.println("Número de homens agressivos: "+hAgressivos);
			System.out.println("Número de outros calmos: "+outrosC);
			System.out.println("Número de pessoas nervosas com mais de 40 anos: "+nervoso40);
			System.out.println("Número de pessoas calmas com menos de 18 anos: "+calmos18);
			
			sc.close();

		}

	}


	}
  

