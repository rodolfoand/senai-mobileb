//Crie um programa para ler dois n�meros e informar se eles s�o iguais ou diferentes

package br.senai.sp.informatica.mobileb.aula03;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0301 {
	public static void main(String[] args) {
		
		int n1 = Util.leInteiro("Informe o 1� n�: ");
		int n2 = Util.leInteiro("Informe o 2� n�: ");
		String msg;
		
		if (n1 == n2) {
			msg = "S�o iguais.";
		} else {
			msg = "S�o diferentes.";
		}
		
		Util.escreva(msg);
	}
}
