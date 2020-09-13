package HerancaPoliformismoColletions;

public class Cavalo extends Animal
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
		System.out.println("Hin rin rin...Hin rin rin...Hin rin rin");
	}
	public String getinfo()
	{
		return getNome()+"\t"+getIdade()+"\t"+getCorre()+"\t";

	}
}
