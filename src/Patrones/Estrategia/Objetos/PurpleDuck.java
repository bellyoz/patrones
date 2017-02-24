package Patrones.Estrategia.Objetos;

import Patrones.Estrategia.Comportamiento.CanFly;
import Patrones.Estrategia.Comportamiento.Republicano;

public class PurpleDuck extends Duck{

	public  PurpleDuck() {
		// TODO Auto-generated constructor stub
		super.FlyBehavior = new CanFly();
		super.QuackBehavior = new Republicano();
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
