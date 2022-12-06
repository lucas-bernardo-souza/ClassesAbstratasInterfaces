package classesAbstratas;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Moeda m = new Moeda();
		m.pegar();
		
		// Não faz sentido na aplicação instanciarmos um Item
		// ele é uma abstração
		/*
		 * Item i = new Item(); i.pegar();
		 */
		// Classe abstrata não pode ter uma instância direta.
		
		Maca maca = new Maca();
		maca.pegar();
		
		// Posso usar a classe abstrata como tipo de dado
		// O que não pode é ter um ainstancia desse tipo criada na memoria
		Item macaUm = new Maca();
		macaUm.pegar();
	}

}
