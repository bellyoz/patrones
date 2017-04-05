package PatronFabricaAbstracta.fabrica;

import PatronFactory.Fabrica.ProductType;

public enum PizzeriaType {
	MARIO, LUIGUI, BOO;
	
	public static PizzeriaType fromInteger(int x){
		switch (x) {
		case 1:
			return MARIO;
		case 2:
			return LUIGUI;
		case 3:
			return  BOO;
		default:
			return null;
		}
	}
}
