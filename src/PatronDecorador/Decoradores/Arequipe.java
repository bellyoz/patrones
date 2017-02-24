package PatronDecorador.Decoradores;

import PatronDecorador.Objetos.Cafe;

public class Arequipe extends Adicion {
	
	public Arequipe(Cafe c) {
		// TODO Auto-generated constructor stub
		super.cafe = c;
	}
	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return 22.5+super.cafe.getValor();
	}

}
