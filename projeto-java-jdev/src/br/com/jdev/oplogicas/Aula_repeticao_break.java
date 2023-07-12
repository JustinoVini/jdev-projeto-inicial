package br.com.jdev.oplogicas;

public class Aula_repeticao_break {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Está passando pela sua rua o numero: " + "[" + i + "]");
			if (i == 3) {
				System.out.println("Ebaaa numero 3");
				System.out.println("Estou parando de executar...");
				continue;
			}
		}

	}
}
