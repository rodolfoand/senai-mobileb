package logica.ex08.respostas;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe o nº");

		escreva("O inverso do nº : ", num, " é " , inverso(num));
	}
	
	static int inverso(int num) {
		int inv = 0;

		while (num > 0) {
			inv = inv * 10 + num % 10;
			num = num / 10;
		}

		return inv;
	}
}
