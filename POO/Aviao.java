package POO;
/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
   esta classe, em seguida crie um objeto avi�o, defina as instancias deste
   objeto e apresente as informa��es deste objeto no console.
 */
public class Aviao {
	 //Atributos= Boeing 777X, Boeing 747, Airbus A380
	
	String modelo;
	String companhia;
	double altitude;
	
	
	public Aviao(String modelo, String companhia, double altitude) 
	{
		this.modelo = modelo;
		this.companhia = companhia;
		this.altitude = altitude;
	}
	public String imprimirinfo() 
	{
		return modelo+companhia+altitude+" Metros de altura";
		
	}

}
