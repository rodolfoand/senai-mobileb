// Crie um programa para ler dois n�meros e escrev�-los em ordem crescente

package br.senai.sp.informatica.mobileb.aula03;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0305 {
	public static void main(String[] args) {
		
		int n1 = Util.leInteiro("Informe o 1� n�: ");
		int n2 = Util.leInteiro("Informe o 2� n�: ");
		String msg;
		
		if (n1 < n2) {
			msg = n1 + " " + n2;
		} else {
			msg = n2 + " " + n1;
		}
		
		Util.escreva(msg);
	}
}
