package logica.ex08.respostas;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº para o cálculo do Fatorial");
		escrevaL("O valor calculado com a dunção fatorial para ", num
				, " é:", fat(num));
	}
	
	// fat(n) => fat(n-1) * n para n > 1
	int fat(int n) {
		if(n > 1)
			return fat(n-1) * n;
		else
			return 1;
	}
}
