package PatronAdapter.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		SequenceEnum opc;
		System.out.println("Elija la opcion que desea realizar: \n 1.Hexagonal \n 2.Catalan \n 3.Fibonnaci");
		int num = Integer.parseInt(leer.readLine().toUpperCase());
		
		if(num==1){
			opc = SequenceEnum.HEXAGONAL;
		} else if(num==2){
			opc = SequenceEnum.CATALAN;
		}
		else{
			opc = SequenceEnum.FIBONACCI;
		}
		
		System.out.println("Digite el numero n de la operacion: ");
		int n = Integer.parseInt(leer.readLine());
		Target target = new Target();
		target.Request(n, opc);
	}

}
