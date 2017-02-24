package PatronObservador.objetos;



import PatronObservador.comportamiento.Observadores;
import PatronObservador.comportamiento.Sujeto;

public class User implements Observadores {
	
	public Sujeto subject;
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(Sujeto subject){
	      this.subject = subject;
	   }

	@Override
	public void notificar(Sujeto sujeto) {
		// TODO Auto-generated method stub
		System.out.println("state : " + sujeto.getState());

	}

}
