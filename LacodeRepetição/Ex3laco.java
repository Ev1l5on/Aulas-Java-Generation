package LacodeRepetição;

import java.util.*;

/*
/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
/*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
/*idade for =-99. (WHILE)
 */
public class Ex3laco {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int idade=0, idade21=0,idade50=0;
		
		while(idade != -99) 
		{
			System.out.println("Informe as idades : ");
			idade = sc.nextInt();
			if(idade<21) 
			{
				idade21++;
			}
			if(idade>50)
			{
				idade50++;
			}
		}
		System.out.println("Total abaixo de 21 :" + idade21++);
		System.out.println("Total acima de 50 :" + idade50++);
		sc.close();

	}

}
