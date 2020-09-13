package ExEncapsulamenteHerança;

public class testeAdministrador {

	public static void main(String[] args) {
		
		Administrador adm = new Administrador ("João Vaso Barros", "Rua buraco sem fim S/n", "11 99876-5432", 900, 450, 400);
		
		System.out.println("Sua ajudade custo é: ");
		System.out.println(adm.getAjudadeDeCusto());
		
		System.out.println("Seus gastos com conbustivel foi: ");
		System.out.println(adm.getGastosCombustivel());
		
		System.out.println("Seus gastos com estadia foi: ");
		System.out.println(adm.getGastoEstadia());
		
		
	}
}