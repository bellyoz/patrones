package PatronDecorador.Decoradores;

import PatronDecorador.Objetos.Cafe;

public class Wisky extends Adicion {

	public Wisky(Cafe c) {
		// TODO Auto-generated constructor stub
		super.cafe = c;
	}
	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return 20.4+super.cafe.getValor();
	}

}
