package HerancaPoliformismoColletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) 
	{
	
	 Collection<produto> estoqueLoja = new ArrayList<produto>();
	 produto a = new produto("Camisas",20,"P","M","G","EG");
	 produto b = new produto("Calças",25,"P","M","G","EG");
	 produto c = new produto("Cuecas",20,"P","M","G","EG");
	 produto d = new produto("Meias",30,"32 a 34", "36 a 38"," 40 a 42","44");
	 produto e = new produto("Tenis",42,"32 a 34", "36 a 38"," 40 a 42","44");
	 produto f = new produto("Sapatos",46,"32 a 34", "36 a 38"," 40 a 42","44");
	 
	 
	 estoqueLoja.add(a);
	 estoqueLoja.add(b);
	 estoqueLoja.add(c);
	 estoqueLoja.add(d);
	 estoqueLoja.add(e);
	 estoqueLoja.add(f);
	 
	 
	 
	// atualizar estoque
	 for(produto  estoque : estoqueLoja )
	 {
		 if (estoque.getQtde() == 42)
		 {
			estoque.setQtde(80);
			 
		 }
	 }

	 
	 for(produto  estoque : estoqueLoja )
	 {
		 System.out.println(estoque.imprime()); // Mosta nome por nome da lista.
	 }
	 
	 // Remover
	 
	 estoqueLoja.remove(c);



	}

}