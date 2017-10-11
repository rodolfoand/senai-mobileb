/* Crie um programa para calcular o sal�rio l�quido de um funcion�rio.
 * O programa recebe atrav�s do teclado o sal�rio bruto de um determinado funcion�rio,
 *  caso este seja inferior a R$ 300,00 � descontado 5% em impostos, se o sal�rio variar de R$ 300,00 at� 1.200,00 � descontado 10% em impostos, se esse for superior a R$ 1.200,00 � descontado 15% em impostos.
 * Ao final o algoritmo deve exibir o sal�rio l�quido do funcion�rio.
 * 
 * 
 */
package br.senai.sp.informatica.mobileb.aula03;

import br.senai.sp.informatica.mobileb.lib.Util;

public class Ex0304 {
	public static void main(String[] args) {
		
		double salBruto = Util.leReal("Informe o sal bruto: ");
		double salLiquido;
				
		if (salBruto < 300) {
			salLiquido = salBruto * 0.95;
		} else if (salBruto < 1200) {
			salLiquido = salBruto * 0.90;
		} else {
			salLiquido = salBruto * 0.85;
		}
		
		String msg = "O Sal Liq � de R$ " + salLiquido;
		
		Util.escreva(msg);
	}
}
