package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {
	public static void main(String[] args) {
		String x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Por favor, digite o C�digo: ");
		x = leitor.next();
		
		switch(x) {
			
		case "1":
			System.out.println("Executa a rotina de Inclus�o de Alunos ");
		break;
		
		case "2":
			System.out.println("Executa a rotina de Altera��o de Alunos");
		break;
		
		case "3":
			System.out.println("Executa a rotina de Exclus�o de Alunos ");
		break;
			
		case "4":
			System.out.println("Executa a rotina de Consulta de Alunos ");
		break;

		}
		
	}

}
