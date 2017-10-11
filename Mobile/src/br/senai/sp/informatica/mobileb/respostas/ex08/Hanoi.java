package br.senai.sp.informatica.mobileb.respostas.ex08;

import br.senai.sp.info132.console.Programa;

public class Hanoi extends Programa {
	@Override
	public void inicio() {
		int discos = leInteiro("Informe o nº de discos");
		escrevaL("Nº movimentos será de: ", hanoi(discos));
	}
	
	int hanoi(int discos) {
		int movimentos = 1;
		
		if(discos > 1)
			movimentos = 2 * hanoi(discos - 1) + 1;
		
		return movimentos;
	}
}
