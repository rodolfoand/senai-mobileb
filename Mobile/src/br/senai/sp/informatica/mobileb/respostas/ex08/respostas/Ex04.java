package logica.ex08.respostas;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		tabuada(leInteiro("Informe o nº"));
	}

	void tabuada(int num) {
		for (int i = 1; i <= 10; i++)
			escrevaL(num, " x ", i, " = ", num * i);
	}
}
