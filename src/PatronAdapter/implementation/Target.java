package PatronAdapter.implementation;

public class Target {
	
	public void Request(int n, SequenceEnum opc){
		switch(opc){
			case FIBONACCI:
				Adapter.getFibonacci(n);
				break;
			case CATALAN:
				Adapter.getCatalan(n);
				break;
			case HEXAGONAL:
				Adapter.getHexagonal(n);
				break;
		}
	}

}
