//Crie um programa para ler um n�mero e informar se ele � par ou impar

package br.senai.sp.informatica.mobileb.aulas.ex03;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0302 {
	public static void main(String[] args) {
		
		int n1 = Util.leInteiro("Informe um n�: ");
		String msg;
		
		if (n1 % 2 == 0) {
			msg = "� par.";
		} else {
			msg = "� impar.";
		}
		
		Util.escreva(msg);
	}
}
