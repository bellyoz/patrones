package PatronPrototype;

public class Imagen  extends Grafico {
	String type;
	@Override
	public Grafico Clone() {
		// TODO Auto-generated method stub
		Imagen img = new Imagen();
		img.setType(this.type);
		return img;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Imagen [type=" + type + "]";
	}
	
	
}
