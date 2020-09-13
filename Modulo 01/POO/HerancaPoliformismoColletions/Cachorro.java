package HerancaPoliformismoColletions;

public class Cachorro extends Animal
{
	private String corre;

	
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
	public void emiteSom(String som)
	{
		System.out.println("Uau...Uau...Uau...");
		
	}
	public String getinfo()
	{
		return getNome()+"\t"+getIdade()+"\t"+getCorre()+"\t";

	}
}
