package br.com.jdev.oplogicas;

public class Aula_while {

	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero <= 20) {
			
			System.out.println("O numero atual é: " + numero);
			// incremento para + 1 numero no elemento, ou seja
			// inicia com 0 e passa a ser 1, dps passar a ser 2 e etc...
			numero++;
		}
		
		/*************************/
		int numero2 = 0;
		do {
			System.out.println("O numero atual é: " + numero2);
		} while (numero <= 50);

	}

}
