package ExEncapsulamenteHerança;
/*
/* Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
/* (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
/* opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
/* String telefone;
 */
public class Ex1EncapsuladoPessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Ex1EncapsuladoPessoa(String nome, String endereco, String telefone) 
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	void imprimir()
	{
		System.out.println("Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone);
		
	}
	void naoDecidi() 
	{
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	
}
