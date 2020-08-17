package ExEncapsulamenteHerança;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado emp = new Empregado ("João Barros Telha","485485","455455",45,55000 , 0.15);
		
		System.out.println(emp.calcularSalario(emp.getSalarioBase(), emp.getImposto()));
		System.out.println();

	}

}
