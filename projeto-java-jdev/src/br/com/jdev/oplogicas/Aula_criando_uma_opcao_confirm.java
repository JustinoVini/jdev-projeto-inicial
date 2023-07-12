package br.com.jdev.oplogicas;

import javax.swing.JOptionPane;

public class Aula_criando_uma_opcao_confirm {
public static void main(String[] args) {
		
		// input de dados com swing ( insere o dado no sistema ) 
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao);
		} else {
			System.out.println("Não quis ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão ?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
		}
		// mensagem de dialogo, com swing, dialog ( mostra a mensagem para nos )
		
		// System.out.println("A divisão para pessoas deu: " + divisao + " de carros e sobrou" + resto + " carros");
	}
}
