package PatronDecorador.Decoradores;

import PatronDecorador.Objetos.Cafe;

public class Chantilly extends Adicion {
	
	public Chantilly(Cafe c) {
		// TODO Auto-generated constructor stub
		super.cafe = c;
	}
	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return 20.2+super.cafe.getValor();
	}

}
