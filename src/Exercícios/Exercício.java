package Exercícios;

import java.util.Scanner;

public class Exercício {
	public static void main(String[] args) {
		String x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Por favor, digite o Código: ");
		x = leitor.next();
		
		switch(x) {
			
		case "1":
			System.out.println("Executa a rotina de Inclusão de Alunos ");
		break;
		
		case "2":
			System.out.println("Executa a rotina de Alteração de Alunos");
		break;
		
		case "3":
			System.out.println("Executa a rotina de Exclusão de Alunos ");
		break;
			
		case "4":
			System.out.println("Executa a rotina de Consulta de Alunos ");
		break;

		}
		
	}

}
