package br.senai.sp.informatica.mobileb.aulas.ex04;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0402 {
	public static void main(String[] args) {
		
		double ladoA = Util.leReal("Informe o 1� lado: ");
		double ladoB = Util.leReal("Informe o 2� lado: ");
		double ladoC = Util.leReal("Informe o 3� lado: ");
		
		if (ladoA == ladoB && ladoB == ladoC) {
			Util.escreva("Equil�tero");
		} else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			Util.escreva("Escaleno");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			Util.escreva("Is�sceles");
		}
	}
}
