package Patrones.Estrategia.Objetos;

import Patrones.Estrategia.Comportamiento.CantFly;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		// TODO Auto-generated constructor stub
		super.FlyBehavior = new CantFly();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.FlyBehavior.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}

}
