package POO;
/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
   referentes esta classe, em seguida crie um objeto produto eletr�nico,
   defina as instancias deste objeto e apresente as informa��es deste objeto
   no console.
 */
public class Tv {

	//Atributos
	
	int canal=4;
	private boolean ligado;
	
	
	public Tv(int canal) 
	{
		this.canal = canal;
		ligado = false;
	}
	public void imprimirinfo()
	{
	 System.out.println("Voce est� assistendo o canal..." + canal);	
	}
	public void ligar() 
	{
		ligado = true;
		System.out.println("Sua Tv est� ligada...");
		
	}
	public void desligar()
	{
		ligado = false;
		System.out.println("Sua Tv esta desligada...");
	}
	
}
