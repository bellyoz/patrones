package PatronDecorador;

import java.util.Scanner;

import PatronDecorador.Componentes.Capuccino;
import PatronDecorador.Componentes.Expresso;
import PatronDecorador.Componentes.Late;
import PatronDecorador.Decoradores.Arequipe;
import PatronDecorador.Decoradores.Chantilly;
import PatronDecorador.Decoradores.Ron;
import PatronDecorador.Decoradores.Wisky;
import PatronDecorador.Objetos.Cafe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Juan Calle Coffee");
		Scanner leer = new Scanner(System.in);
		int x = 0;
		while (x != 5) {
			System.out.println("Que cafe desea?");
			System.out.println("1. Expresso");
			System.out.println("2. Late");
			System.out.println("3. Capuccino");
			x = leer.nextInt();
			switch (x) {
			case 1: Cafe c = new Expresso();
					
					break;
			default:
				break;
			}
		}
		/*
		 * Cafe c = new Late(); c = new Arequipe(c); c = new Ron(c);
		 * System.out.println("valor 1 "+c.getValor());
		 * System.out.println("___________________________"); Cafe a = new
		 * Capuccino(); a = new Wisky(a); a = new Chantilly(a); a = new Ron(a);
		 * a= new Ron(a); a = new Ron(a);
		 * System.out.println("el precio es  "+a.getValor());
		 */
	}

}
