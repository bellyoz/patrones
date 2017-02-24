package PatronObservador.objetos;

import java.util.ArrayList;

import PatronObservador.comportamiento.Observadores;
import PatronObservador.comportamiento.Sujeto;

public class Canal implements Sujeto {

	private ArrayList<Observadores> lista;
	private String state;
	
	public Canal() {
		// TODO Auto-generated constructor stub
		lista = new ArrayList<>();
	}
	@Override
	public void subs(Observadores o) {
		// TODO Auto-generated method stub
		lista.add(o);	
	}

	@Override
	public void unSubs(String o) {
		// TODO Auto-generated method stub
		lista.remove(this);
	}

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}

}
