package PatronFabricaAbstracta.concreto;

import PatronFabricaAbstracta.PepperoniPizza;
import PatronFabricaAbstracta.Pizza;
import PatronFabricaAbstracta.TropicalPizza;
import PatronFabricaAbstracta.fabrica.Pizzeria;

public class MariosPizza extends Pizzeria {

	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu Marios Pizza");
		System.out.println("1.tropical , 2.Pepperoni");

	}

	@Override
	public Pizza getPizza(int option) {
		// TODO Auto-generated method stub
		switch (option) {
		case 1:

			return new TropicalPizza();
		case 2:

			return new PepperoniPizza();

		default:
			return null;
		}

	}

}
