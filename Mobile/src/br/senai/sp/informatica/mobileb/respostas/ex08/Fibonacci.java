package br.senai.sp.informatica.mobileb.respostas.ex08;

import br.senai.sp.info132.console.Programa;

public class Fibonacci extends Programa {
	@Override
	public void inicio() {
		int semanas = leInteiro("Informe o nº de casais");
		escrevaL("O Nº de casais será de: ", fib(semanas));
	}
	
	int fib(int sem) {
		int total = 1;
		
		if(sem > 2)
			total = fib(sem - 2) + fib(sem -1);
		
		return total;
	}
}
