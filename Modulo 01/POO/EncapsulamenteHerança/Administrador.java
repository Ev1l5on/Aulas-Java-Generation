package ExEncapsulamenteHerança;
/*
 * Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
   administrador tem como atributos da classe Pessoa e também os atributos próprios como
   ajudaDeCusto (ajudas referentes a viagens, estadias).
 */
public class Administrador extends Ex1EncapsuladoPessoa{
	
	private int ajudadeDeCusto;
	private double gastosCombustivel;
	private double gastoEstadia;
	
	
	public Administrador(String nome, String endereco, String telefone, int ajudadeDeCusto, double gastosCombustivel,
			double gastoEstadia) {
		super(nome, endereco, telefone);
		this.ajudadeDeCusto = ajudadeDeCusto;
		this.gastosCombustivel = gastosCombustivel;
		this.gastoEstadia = gastoEstadia;
	}


	public int getAjudadeDeCusto() {
		return ajudadeDeCusto;
	}

	public void setAjudadeDeCusto(int ajudadeDeCusto) {
		this.ajudadeDeCusto = ajudadeDeCusto;
	}

	public double getGastosCombustivel() {
		return gastosCombustivel;
	}

	public void setGastosCombustivel(double gastosCombustivel) {
		this.gastosCombustivel = gastosCombustivel;
	}

	public double getGastoEstadia() {
		return gastoEstadia;
	}

	public void setGastoEstadia(double gastoEstadia) {
		this.gastoEstadia = gastoEstadia;
	}
	
	
	

	
			
}
