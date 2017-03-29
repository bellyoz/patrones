package PatronPrototype;

public class Pintucar {
	public Grafico grafico;
	
	public void setPrototype(Grafico grafico){
		this.grafico = grafico;
	}
	public Grafico getNewInstance(){
		return this.grafico.Clone();
	}

}
