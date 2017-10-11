package logica.ex08.respostas;

import br.senai.sp.info132.console.Programa;

public class ExPunk extends Programa {
	@Override
	public void inicio() {
		int limite = leInteiro("Informe o limite");
		int num = 3;
		int total = 0;
		for (int i = 0; num <= limite; i++) {
			if(num == 3)
				escreva(num);
			else
				escreva(", ", num);
			
			total += num;
			num += i % 2 == 0 ? 2 : 5;
		}
		escrevaL("\nTotal: ", total);
	}
}
