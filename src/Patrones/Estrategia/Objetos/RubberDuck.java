package Patrones.Estrategia.Objetos;

import Patrones.Estrategia.Comportamiento.CantFly;
import Patrones.Estrategia.Comportamiento.Democrat;

public class RubberDuck extends Duck{
	
	public  RubberDuck() {
		// TODO Auto-generated constructor stub
		super.FlyBehavior = new CantFly();
		super.QuackBehavior = new Democrat();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.FlyBehavior.fly();
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.QuackBehavior.quack();
	}

}
