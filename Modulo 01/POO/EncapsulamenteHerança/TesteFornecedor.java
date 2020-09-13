package ExEncapsulamenteHerança;

public class TesteFornecedor {

	public static void main(String[] args) {
		Ex2Fornecedor fc = new Ex2Fornecedor("Raul Seixas", "Rua da Pampulha", "99876-5432", 1000,  999);
		
		
		
		System.out.println(fc.obterSaldo(fc.getValorCredito(), fc.getValorDivida()));
		
		System.out.println();

	}

}
