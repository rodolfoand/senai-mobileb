package br.senai.sp.informatica.mobileb.aula01;

import java.util.Scanner;

//Usando o Console do Eclipse para receber epresentar informa��es 


public class Exemplo1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		String nome = console.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = console.nextInt();
		System.out.print("Informe sua preten��o salarial: ");
		double pretSalarial = console.nextDouble();
		
		System.out.println(nome + " com a idade de " + idade + " sua preten��o salarial � de R$ " + pretSalarial + " � alta");
		
		console.close();
	}
}
