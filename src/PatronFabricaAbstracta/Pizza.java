package PatronFabricaAbstracta;

import java.util.ArrayList;

public abstract class Pizza {

	public int tamaño;
	public ArrayList<String> ingredientes;
	String base;
	String masa;



	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

}
