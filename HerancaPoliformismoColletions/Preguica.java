package HerancaPoliformismoColletions;

public class Preguica extends Animal
{
	private String subirEmArvores;
	
	public String getSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}

	public void emiteSom(String som)
	{
		System.out.println("Haa...Haa...Haa");
		
	}
	
	public String getinfo()
	{
		return getNome()+"\t"+getIdade()+"\t"+getSubirEmArvores()+"\t";

	}
	

}
