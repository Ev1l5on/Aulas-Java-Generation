package POO;

public class testeCarro {

	public static void main(String[] args) {
		Carro  meuCarro = new Carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
		System.out.println(meuCarro.pegaMarcha());

	}

}
