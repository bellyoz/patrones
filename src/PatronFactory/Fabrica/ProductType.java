package PatronFactory.Fabrica;

public enum ProductType {
	SWITCH,PLAYCUATRO,XBOX;
	
	public static ProductType fromInteger(int x){
		switch (x) {
		case 1:
			return SWITCH;
		case 2:
			return PLAYCUATRO;
		case 3:
			return XBOX;
		default:
			return null;
		}
	}
}
