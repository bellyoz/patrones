package PatronObservador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import PatronObservador.objetos.Canal;
import PatronObservador.objetos.User;

public class main {
	public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canal tutoriales = new Canal();
		tutoriales.setState("java");
		tutoriales.setName("Tutoriales");
		try {
			int aux = 1;
			do {
				System.out.println("1.Suscribir \n2.Desuscribir \n3.Cambiar Estado");
				int opc = Integer.parseInt(leer.readLine());
				switch (opc) {
				case 1:
					System.out.println("Suscribiendo al canal : " + tutoriales.getName());
					System.out.println("Ingrese su usuario");
					String name = leer.readLine();
					User user = new User(name);
					tutoriales.subs(user);
					break;
				case 2:
					System.out.println("Ingrese su usuario ");
					String namee = leer.readLine();
					tutoriales.unSubs(namee);
					break;
				case 3:
					System.out.println("Ingrese el estado: ");
					String estado = leer.readLine();
					tutoriales.setState(estado);
					break;
				default:
					break;
				}
				System.out.println("presione 1 para continuar o 0 para salir del sistema");
				aux = Integer.parseInt(leer.readLine());
			} while (aux != 0);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
