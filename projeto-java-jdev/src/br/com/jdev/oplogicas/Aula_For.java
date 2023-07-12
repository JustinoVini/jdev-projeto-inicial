package br.com.jdev.oplogicas;

public class Aula_For {
	public static void main(String[] args) {
		
		for(int i =0; i < 10; i++) {
			System.out.println("Estrutura de for com i: " + "[" + i + "]");
			for(int j = 0; j < 10; j++) {
				System.out.println("Estrutura de for com j: " + "[" + j + "]");
				for (int k = 0; k < 10; k++) {
					System.out.println("Estrutura de for com k: " + "[" + k + "]");
				}
			}
		}
	}
}
