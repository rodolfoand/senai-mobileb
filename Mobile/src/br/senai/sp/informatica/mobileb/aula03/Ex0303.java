// Crie um programa para ler dois n�meros e informar se um � divis�vel pelo outro ou n�o

package br.senai.sp.informatica.mobileb.aula03;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0303 {
	public static void main(String[] args) {
		
		int n1 = Util.leInteiro("Informe o valor de A: ");
		int n2 = Util.leInteiro("Informe o valor de B: ");
		String msg;
		
		if (n1 % n2 == 0) {
			msg = "� divis�vel.";
		} else {
			msg = "N�o � divis�vel.";
		}
		
		Util.escreva(msg);
	}
}
