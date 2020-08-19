package HerancaPoliformismoColletions;

public abstract class Animal 
{
	private String nome;
	private int idade;
	private String correr;
	
	//Metodo abstrato para o uso de  polimorfismo
	abstract public void emiteSom (String som);


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
