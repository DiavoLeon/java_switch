package Exerc�cios;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exerc�cio {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        
        float x, novoSalario = 0f;
        int y;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o Sal�rio do funcion�rio: ");
		x = leitor.nextFloat();
						
		System.out.println("Digite o C�digo do funcion�rio: ");
		y = leitor.nextInt();
		
		switch (y) { 
		
			case 001:
				System.out.println("Diretor");
				novoSalario = ( x + (x * 10) / 100);
			break;
			
			case 002:
				System.out.println("Engenheiro");
				novoSalario = (x + (x * 20) / 100);
			break;
			
			case 003:
				System.out.println("T�cnico");
				novoSalario = (x + (x * 30) /100);
			break;
				
			case 004:
				System.out.println("Gerente");
				novoSalario = (x + (x * 10) /100);
			break;
			
			case 005:
				System.out.println("Analista");
				novoSalario = (x + (x * 30)/ 100);
			break;
			
			case 006:
				System.out.println("Coordenador");
				novoSalario = (x + (x * 20) /100);
			break;
		
			default:
				System.out.println("Funcion�rio Fora da Tabela");
				novoSalario = (x + (x * 40) /100);
			break;
		}
		System.out.println("Sal�rio Antigo: " + x);
		System.out.println("Novo Sal�rio: " + novoSalario);
		System.out.println("Diferen�a : " + (novoSalario - x));
	}
}
	

