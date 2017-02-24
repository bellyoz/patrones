package Patrones.Estrategia;

import Patrones.Estrategia.Objetos.PurpleDuck;
import Patrones.Estrategia.Objetos.RubberDuck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurpleDuck pato = new PurpleDuck();
		pato.fly();
		
		System.out.println("------------------------------");
		
		RubberDuck patito = new RubberDuck();
		patito.fly();
		
		System.out.println("_________________________________");
		
		pato.quack();
		System.out.println("------------------------");
		patito.quack();
	}

}
