package PatronFabricaAbstracta;

import java.util.ArrayList;

public abstract class Pizza {

	public int tama�o;
	public ArrayList<String> ingredientes;
	String base;
	String masa;



	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

}
