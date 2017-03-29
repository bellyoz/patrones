package PatronFactory.Concretos;

import PatronFactory.Fabrica.Consola;

public class Switch extends Consola {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo ...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando ...");
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Switch");
	}

}
