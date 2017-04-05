package PatronFabricaAbstracta.fabrica;

import PatronFabricaAbstracta.Pizza;
import PatronFabricaAbstracta.concreto.BooPizza;
import PatronFabricaAbstracta.concreto.LuiguiPizza;
import PatronFabricaAbstracta.concreto.MariosPizza;

public abstract class Pizzeria {

	public static Pizzeria getFactory(PizzeriaType pro) {
		try {
			switch (pro) {
			case MARIO:
				return new MariosPizza();
			case LUIGUI:
				return new LuiguiPizza();
			case BOO:
				return new BooPizza();
			default:
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	public abstract void getMenu();

	public abstract Pizza getPizza(int option);

}
