package PatronFactory.Fabrica;

import PatronFactory.Concretos.PlayCuatro;
import PatronFactory.Concretos.Switch;
import PatronFactory.Concretos.Xbox;

public class ConsoleFactory {
	public Consola create(ProductType pro) {
		try {
			switch (pro) {
			case SWITCH:
				return new Switch();
			case PLAYCUATRO:
				return new PlayCuatro();
			case XBOX:
				return new Xbox();
			default:
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
}
