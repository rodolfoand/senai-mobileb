package br.senai.sp.informatica.mobileb.aulas.exemplos;

import javax.swing.JOptionPane;

//Usando JOptionPane para receber e apresentar informa��es 

public class Exemplo2 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
				
		String temp = JOptionPane.showInputDialog("Informe a idade: ");
		int idade = Integer.parseInt(temp);
		
		temp = JOptionPane.showInputDialog("Informe sua preten��o salarial: ");
		double pretSalarial = Double.parseDouble(temp);
				
		
		JOptionPane.showMessageDialog(null, nome + " com a idade de " + idade + " sua preten��o salarial de R$ " + pretSalarial + " � alta");
				
	}
}
