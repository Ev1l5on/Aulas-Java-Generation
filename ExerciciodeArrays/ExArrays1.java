package ExerciciodeArrays;

import java.util.Scanner;

/*
 * Faça um programa que possua um vetor denominado A que armazene 6 números
   inteiros. O programa deve executar os seguintes passos:
   (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
   (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
   A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
   (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
   (d) Mostre na tela cada valor do vetor A, um em cada linha.
 */
public class ExArrays1 {

	public static void main(String[] args) {
		
int i,soma=0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros inteiros");
		
		
		int [] A = new int[6];
		
		for (i=0;i<A.length;i++) {
			A[i]= sc.nextInt();
			
		}
		
		soma =soma + A[0]+A[1]+A[5];
		
		System.out.println(" A soma dos valores dos indices  A[0]+A[1]+A[5] é: " + soma);
		
		A[4] =100;
		
		System.out.println("O valor do indice 4 foi alterado para  " + A[4] );
		
		System.out.println("todos valor de A");
		 for(i=0; i<A.length;i++) {
			 
			 System.out.println(A[i]);
			 
		
		 }	 
		
		
	}
	
		
		
		
	}