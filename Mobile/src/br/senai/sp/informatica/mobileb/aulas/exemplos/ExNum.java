package br.senai.sp.informatica.mobileb.aulas.exemplos;

import javax.swing.JOptionPane;

public class ExNum {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe um n�");
		int num = Integer.parseInt(temp);
		
		int x = num % 100;
		
		JOptionPane.showMessageDialog(null, "n� antes: " + num +  "\ndepois: " + x);
	}
}
