package interfaces;

public class Aplicacao {

	public static void main(String[] args) {
		// Na interface é possível focar no que o objeto faz e não em como ele faz
		// Separa a implementação da definição. O sistema interage apenas com a interface
		
		Ferrari f = new Ferrari();
		
		Rota rota = new Rota();
		
		// Se um classe implementa uma interface ela é do tipo da interface
		// Então ferrari além de ser do tipo ferrari é do tipo automovel
		rota.ir(f);
		
		AnelBrilhante a = new AnelBrilhante();
		Vendedor v = new Vendedor();
		v.mostrarPreco(f);
		v.mostrarPreco(a);
		
	}

}
