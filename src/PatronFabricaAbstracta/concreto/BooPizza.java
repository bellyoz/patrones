package PatronFabricaAbstracta.concreto;

import PatronFabricaAbstracta.MeatPizza;
import PatronFabricaAbstracta.PepperoniPizza;
import PatronFabricaAbstracta.Pizza;
import PatronFabricaAbstracta.TropicalPizza;
import PatronFabricaAbstracta.fabrica.Pizzeria;

public class BooPizza extends Pizzeria {
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu Boo Pizza");
		System.out.println("1.MeatPizza , 2.Pepperoni");

	}

	@Override
	public Pizza getPizza(int option) {
		// TODO Auto-generated method stub
		switch (option) {
		case 1:

			return new MeatPizza();
		case 2:

			return new PepperoniPizza();

		default:
			return null;
		}

	}
}
