package PatronObservador.objetos;

import java.util.ArrayList;

import PatronObservador.comportamiento.Observadores;
import PatronObservador.comportamiento.Sujeto;

public class Canal implements Sujeto {

	private ArrayList<Observadores> lista;
	private String state;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
		boolean isUser=false;
		for(int i=0; i<lista.size(); i++){
			if(lista.get(i).getName().equalsIgnoreCase(o)){
				lista.remove(i);
				isUser=true;
			}
		}
		if(isUser==false){
			System.out.println("El usuario no existe");
		}
	}

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		this.state = state;
		for(int i=0; i<lista.size(); i++){
			lista.get(i).notificar(this);
		}
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}

}
