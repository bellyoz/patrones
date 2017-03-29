package PatronPrototype;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Creando imagen");
			Pintucar pb = new Pintucar();
			Imagen img = new Imagen();
			img.setType("soy una imagen");
			pb.setPrototype(img);
			Imagen img2 = (Imagen) pb.getNewInstance();
			System.out.println("imagen : "+img2.getType());
			System.out.println("_______________________________");
			System.out.println("Creando video ");
			Video video = new Video();
			video.setType("soy videito");
			pb.setPrototype(video);
			
			ArrayList<Imagen> listaImg = new ArrayList<>();
			
			Imagen img3 = new Imagen();
			img3.setType("imagen 3");
			pb.setPrototype(img3);
			listaImg.add((Imagen) pb.getNewInstance());
			
			Imagen img4 = new Imagen();
			img4.setType("imagen 4");
			pb.setPrototype(img4);
			listaImg.add((Imagen) pb.getNewInstance());
			
			video.setImagenes(listaImg);
			pb.setPrototype(video);
			
			Video video2 = (Video) pb.getNewInstance();
			System.out.println("video : "+video2.getType());
			System.out.println("imagenes : "+video2.getImagenes().toString());
		
			
		
	}

}
