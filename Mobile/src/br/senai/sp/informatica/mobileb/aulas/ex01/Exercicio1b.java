package br.senai.sp.informatica.mobileb.aulas.ex01;

import javax.swing.JOptionPane;

public class Exercicio1b {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe a 1� nota: ");
		double nota1 = Double.parseDouble(temp);
		
		temp = JOptionPane.showInputDialog("Informe a 2� nota: ");
		double nota2 = Double.parseDouble(temp);
		
		temp = JOptionPane.showInputDialog("Informe a 3� nota: ");
		double nota3 = Double.parseDouble(temp);
		
		temp = JOptionPane.showInputDialog("Informe a 4� nota: ");
		double nota4 = Double.parseDouble(temp);
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		JOptionPane.showMessageDialog(null, media);
	}
}
