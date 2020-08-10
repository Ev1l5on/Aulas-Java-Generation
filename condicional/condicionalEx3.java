package condicional;

import java.util.Scanner;

public class condicionalEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		
		System.out.println("Nome: "+ nome);
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria: Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		}
		else if(idade >= 18 && idade <= 25){
			System.out.println("Categoria: Adulto");
		}
		else {
			System.out.println("Ta loko??");
		}
		
		sc.close();

	}

}





