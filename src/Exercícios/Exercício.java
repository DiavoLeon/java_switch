package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {
	
	public static void main(String[] args) {
	float x, y, z;
	int escolhaDeCalculo;
	
	Scanner leitor = new Scanner (System.in);
	
	System.out.println("Digite a primeira nota: ");
	x = leitor.nextFloat();
	
	System.out.println("Digite a segunda nota: ");
	y = leitor.nextFloat();
			
	System.out.println("Digite a terceira nota: ");
	z = leitor.nextFloat();
	
	System.out.println("Por qual m�todo voc� deseja calcular as notas? ");
	
	System.out.println("Digite 1 para M�dia Aritm�tica");
	
	System.out.println("Digite 2 para M�dia Ponderada");
	
	escolhaDeCalculo = leitor.nextInt();
	
	switch(escolhaDeCalculo){
		case 1:
			System.out.println((x + y + z)/3);
		break;
		
		case 2:
			System.out.println(((x * 3) + (y *3) + (z *4)) /10);
		break;
		
	default:
		System.out.println("Op��o Inv�lida");
		break;
	}
	}
}
