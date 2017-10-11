package br.senai.sp.informatica.mobileb.aulas.ex04;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0404 {
	public static void main(String[] args) {
		
		String nome = Util.leString("Informe o Nome: ");
		
		double nota = Util.leReal("Informe a 1� Nota: ");
		nota += Util.leReal("Informe a 2� Nota: ");
		nota += Util.leReal("Informe a 3� Nota: ");
		nota = nota / 3;
		
		int falta = Util.leInteiro("Informe o n� de faltas: ");
		
		if (nota >= 7 && falta <= 15) {
			Util.escreva(nome, ", voc� foi: Aprovado");
		} else if (nota < 7 && falta <= 15) {
			Util.escreva(nome, ", voc� foi: Reprovado");
		} else {
			Util.escreva(nome, ", voc� foi: Reprovado por faltas");
		}
		
	}
}
