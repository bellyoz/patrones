package PatronFabricaAbstracta.concreto;

import PatronFabricaAbstracta.MeatPizza;
import PatronFabricaAbstracta.PepperoniPizza;
import PatronFabricaAbstracta.Pizza;
import PatronFabricaAbstracta.TropicalPizza;
import PatronFabricaAbstracta.fabrica.Pizzeria;

public class LuiguiPizza extends Pizzeria {
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu Luigys Pizza");
		System.out.println("1.tropical , 2.meatPizza");

	}

	@Override
	public Pizza getPizza(int option) {
		// TODO Auto-generated method stub
		switch (option) {
		case 1:

			return new TropicalPizza();
		case 2:

			return new MeatPizza();

		default:
			return null;
		}

	}
}
