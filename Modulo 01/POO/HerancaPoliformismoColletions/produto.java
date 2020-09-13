package HerancaPoliformismoColletions;

public class produto {
	private String produto;
	private int qtde;
	private String tamanhoP;
	private String tamanhoM;
	private String tamanhoG;
	private String tamanhoEG;
	public produto(String produto, int qtde, String tamanhoP, String tamanhoM, String tamanhoG, String tamanhoEG) {
		this.produto = produto;
		this.qtde = qtde;
		this.tamanhoP = tamanhoP;
		this.tamanhoM = tamanhoM;
		this.tamanhoG = tamanhoG;
		this.tamanhoEG = tamanhoEG;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String getTamanhoP() {
		return tamanhoP;
	}
	public void setTamanhoP(String tamanhoP) {
		this.tamanhoP = tamanhoP;
	}
	public String getTamanhoM() {
		return tamanhoM;
	}
	public void setTamanhoM(String tamanhoM) {
		this.tamanhoM = tamanhoM;
	}
	public String getTamanhoG() {
		return tamanhoG;
	}
	public void setTamanhoG(String tamanhoG) {
		this.tamanhoG = tamanhoG;
	}
	public String getTamanhoEG() {
		return tamanhoEG;
	}
	public void setTamanhoEG(String tamanhoEG) {
		this.tamanhoEG = tamanhoEG;
	}
	
	public String imprime() {
		return " Produto: "+ produto+
				" Qtde: "+qtde+
				" tamanho: "+tamanhoP+", "+tamanhoM+", "+tamanhoG+", "+tamanhoEG;
	}
	

}
