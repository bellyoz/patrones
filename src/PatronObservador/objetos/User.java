package PatronObservador.objetos;



import PatronObservador.comportamiento.Observadores;
import PatronObservador.comportamiento.Sujeto;

public class User implements Observadores {
	
	public String name;
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void notificar(Sujeto sujeto) {
		// TODO Auto-generated method stub
		System.out.println(name+ " state : " + sujeto.getState());
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
