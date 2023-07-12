package br.com.jdev.oplogicas;

public class Aula_op_ternario {

	public static void main(String[] args) {
		/*
		 * op ternario são para micro validações.
		 */
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}*/
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "aluno aprovado" : "aluno reprovado";
		System.out.println(saidaResultado);
	}

}
