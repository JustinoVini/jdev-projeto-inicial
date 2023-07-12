package br.com.jdev.oplogicas;

/**
 * 
 * @author Vini
 *
 *         Exercicios com IF e Else (estruturas logicas)
 */
public class Aula_if_else {
	public static void main(String[] args) {
		
		/*
		 * Calculo de média com if e else simples.
		 */
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
	}
}

// if e else básico
/*
 * int mediaAluno = 70;
 * 
 * String nome = "Vinicius";
 * 
 * // média do aluno maior ou igual a 70 E nome vinicius if (mediaAluno >= 70 &&
 * nome.equals("Vinicius")) { System.out.println("Parabens voce está aprovado");
 * } else if (mediaAluno < 70) { System.out.println("Você foi reprovado!"); }
 * else { System.out.println("Aluno não encontrado"); }
 */