package POO;
/*
 * Crie uma classe produto eletrônico e apresente os atributos e métodos
   referentes esta classe, em seguida crie um objeto produto eletrônico,
   defina as instancias deste objeto e apresente as informações deste objeto
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
	 System.out.println("Voce está assistendo o canal..." + canal);	
	}
	public void ligar() 
	{
		ligado = true;
		System.out.println("Sua Tv está ligada...");
		
	}
	public void desligar()
	{
		ligado = false;
		System.out.println("Sua Tv esta desligada...");
	}
	
}
