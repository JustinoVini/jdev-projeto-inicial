package br.com.jdev.oplogicas;

public class Aula_switch_case {
	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Serve para operações exatas */
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
			// default sai da execução e encerra caso seja um valor que não seja os especificos
		default: 
			System.out.println("Outro dia qualquer");
			break;
		}
		
	}
}
