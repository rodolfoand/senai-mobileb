package br.senai.sp.informatica.mobileb.aulas.ex05;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0505 {
	public static void main(String[] args) {
		
		double sal = 0;
		
		do {
			sal = Util.leReal("Informe o Sal�rio: ");
			
			if (sal <=500) {
				sal *= 1.2;
			} else {
				sal *= 1.1;
			}
			
			if (sal == 0) {
				break;
			}
			
			Util.escreva("O Sal�rio com aumento � de $" + sal);
		} while (sal != 0);
	}
}
