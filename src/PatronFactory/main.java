package PatronFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import PatronFactory.Fabrica.Consola;
import PatronFactory.Fabrica.ConsoleFactory;
import PatronFactory.Fabrica.ProductType;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		Consola consola;
		ConsoleFactory console = new ConsoleFactory();
		int opc = 0;
		while (opc != 4) {
			System.out.println("Consola que desea jugar");
			System.out.println("1.Switch , 2.PlayCuatro , 3.Xbox , 4.Salir");
			opc = Integer.parseInt(leer.readLine());
			consola = console.create(ProductType.fromInteger(opc));
			if(consola != null){
			consola.encender();
			consola.jugar();
			consola.apagar();
			}
		}
	}

}
