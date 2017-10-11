package logica.ex08.respostas;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	@Override
	public void inicio() {
		int  num = leInteiro("Informe um nº");
		escrevaL("Este nº é ", ehPar(num) ? "par" : "impar");		
	}
	
	boolean ehPar(int num) {
		return num % 2 == 0;
	}
}
