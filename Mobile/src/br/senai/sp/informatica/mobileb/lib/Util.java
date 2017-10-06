package br.senai.sp.informatica.mobileb.lib;

import javax.swing.JOptionPane;

public class Util {
	
	public static int leInteiro(String msg) {
		String temp = JOptionPane.showInputDialog(msg);
		
		int num = Integer.parseInt(temp);
		return num;
	}
	
	public static String leString(String msg) {
		String temp = JOptionPane.showInputDialog(msg);
				
		return temp;
	}

	public static double leReal(String msg) {
		String temp = JOptionPane.showInputDialog(msg);

		return Double.parseDouble(temp);
	}
	
	public static void escreva(Object ... texto) {
		String txt = "";
		for (int i = 0; i < texto.length; i++) {
			Object obj = texto[i];
			txt = txt + obj;
		}
		
		
//		for (Object obj : texto) {
//			txt += obj;
//		}
		JOptionPane.showMessageDialog(null, txt);
	}
}
