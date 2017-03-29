package PatronAdapter.implementation;

import PatronAdapter.Logica.Secuencia;

public class Adapter {
	
	public static Secuencia secuencia = new Secuencia();
	
	public static void getHexagonal(int n){
		try {
			System.out.println(secuencia.getHexagonal(n));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void getCatalan(int n){
		try {
			System.out.println(secuencia.getCatalan(n));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void getFibonacci(int n){
		try {
			System.out.println(secuencia.getfibo(n));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
