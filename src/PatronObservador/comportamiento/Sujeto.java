package PatronObservador.comportamiento;

public interface Sujeto {
	public void subs(Observadores o);
	public void unSubs(String o);
	public void setState(String state);
	public String getState();
}
