package PatronAdapter.Logica;

import java.util.ArrayList;

public class Secuencia {

	public ArrayList<Integer> getHexagonal(int n) {
		ArrayList<Integer> hexa = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			hexa.add(i * ((2 * i) - 1));
		}
		return hexa;
	}

	public ArrayList<Long> getCatalan(int n) {
		ArrayList<Long> cata = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			cata.add((factorial(2 * i)) / (factorial(i + 1) * factorial(i)));
		}
		return cata;
	}

	private long factorial(long numero) {
		if (numero == 0)
			return 1;
		else
			return (numero * factorial(numero - 1));
	}
	
	public ArrayList<Long> getfibo(int n){
		ArrayList<Long> fibo = new ArrayList<>();
		for(int i = 1 ; i <= n ; i++){
			fibo.add(getFibonacci(i));
		}
		return fibo;
	}
	private  long getFibonacci(long n) {
		long rta = 0;
		if (n == 0 || n == 1) {
			rta = n;
		} else {
			rta = getFibonacci(n - 2) + getFibonacci(n - 1);
		}
		return rta;

	}

}
