package PatronObservador.comportamiento;

public interface Observadores {
	public void notificar(Sujeto sujeto);
	public void setName(String name);
	public String getName();
}
