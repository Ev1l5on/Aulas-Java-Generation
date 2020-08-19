package HerancaPoliformismoColletions;

public class TestesDosAnimais {

	public static void main(String args[]) {
		
		Preguica preguica = new Preguica();
		preguica.setNome("Soneca");
		preguica.setIdade(5);
		preguica.setSubirEmArvores("A Soneca está subindo na arvore!!");
		preguica.emiteSom("Haaa...Haaa...Haaa");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome(" Toto");
		cachorro.setIdade(8);
		cachorro.setCorre("O Toto correu atrás do carteiro!");
		cachorro.emiteSom("Uau...Uau...Uau...");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pangare");
		cavalo.setIdade(5);
		cavalo.setCorre("O Pangare corre muito!!");
		cavalo.emiteSom("\"Hin rin rin...Hin rin rin...Hin rin rin\"");
		
		Animal[] animais = new Animal [3];
		animais[0]= preguica;
		animais[1]= cachorro;
		animais[2]= cavalo;
		
		for(Animal animal:animais )
		{
			System.out.println(animal.getNome());
			System.out.println(animal.getIdade());
			System.out.println(animal.getCorrer());
			
		}
		

	}

}
