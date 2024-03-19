package exercicio_operadores_aritmeicos;

import java.util.Scanner;

public class conversor_tempo {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
		
			// tempo em minutos
			System.out.println("Insira o tempo em minutos:");
			int n1 = scan.nextInt();
						
			System.out.println("\nO tempo é em minutos é " + (n1));
			System.out.println("O Tempo em horas e minutos é: " + (n1/60) + " hora(s) e " + (n1%60) + " minuto(s)");

		scan.close();
	}
}