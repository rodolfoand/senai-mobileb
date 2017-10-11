package br.senai.sp.informatica.mobileb.respostas.ex08;

import br.senai.sp.info132.console.Programa;

public class ExemploCalcule3 extends Programa {
	@Override
	public void inicio() {
		escrevaL("O produto ", 
				leTexto("Informe o Nome do Produto"),
				" terá um custo de R$", 
				calcula(leReal("Informe o Preço")));
	}
	
	double calcula(double valor) {
		double taxa = 1.15;
		return valor * taxa;
	}
}
