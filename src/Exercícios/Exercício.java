package Exercícios;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercício {
	
	public static void main(String[] args) {
		Float x;
		int y;
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        
        
        
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o Preço Contido na Etiqueta: ");
		x = leitor.nextFloat();
		
		System.out.println("Digite o Método de Pagamento escolhido: ");
		y = leitor.nextInt();
		
		
		switch(y) {
		
		case 1:
			System.out.println(df.format(x + (x * 10 / 100)));
			break;
			
		case 2:
			System.out.println(df.format(x + (x * 5) /100));
			break;
		
		case 3:
			System.out.println(df.format(x / 2));
			break;
			
		case 4:
			System.out.println(df.format(((x * 10 / 100) + x)  / 3));
			break;
		}
	}

}
