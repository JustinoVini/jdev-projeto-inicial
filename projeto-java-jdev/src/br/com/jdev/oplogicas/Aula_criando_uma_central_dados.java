package br.com.jdev.oplogicas;

import javax.swing.JOptionPane;

public class Aula_criando_uma_central_dados {

	public static void main(String[] args) {
		
		// input de dados com swing ( insere o dado no sistema ) 
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		// mensagem de dialogo, com swing, dialog ( mostra a mensagem para nos )
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao + " carros e sobrou: " + resto + "carros");
		// System.out.println("A divisão para pessoas deu: " + divisao + " de carros e sobrou" + resto + " carros");
	}

}
