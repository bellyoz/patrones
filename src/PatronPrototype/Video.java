package PatronPrototype;

import java.util.ArrayList;

public class Video extends Grafico {
	String type;
	ArrayList<Imagen> imagenes = new ArrayList<>();
	@Override
	public Grafico Clone() {
		// TODO Auto-generated method stub
		Video video = new Video();
		video.setType(this.type);
		
		video.setImagenes((ArrayList<Imagen>) this.imagenes.clone());
		return video;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public ArrayList<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(ArrayList<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
	
	

}
