package PatronDecorador.Decoradores;

import PatronDecorador.Objetos.Cafe;

public class Ron extends Adicion {
	public Ron(Cafe c) {
		// TODO Auto-generated constructor stub
		super.cafe = c;
	}
	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return 10.2+super.cafe.getValor();
	}

}
