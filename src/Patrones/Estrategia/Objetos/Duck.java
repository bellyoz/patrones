package Patrones.Estrategia.Objetos;

import Patrones.Estrategia.Comportamiento.Flyable;
import Patrones.Estrategia.Comportamiento.Quackable;

public abstract class Duck {
	protected Flyable FlyBehavior;
	protected Quackable QuackBehavior;

	public abstract void fly();
	
	public abstract void quack();
}
