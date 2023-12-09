package javanaveia;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		        Scanner scanner = new Scanner(System.in);

		        int totalPares = 0;
		        int totalImpares = 0;

		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Digite o " + i + "º número: ");
		            int numero = scanner.nextInt();

		            if (numero % 2 == 0) {
		                totalPares++;
		            } else {
		                totalImpares++;
		            }
		        }

		        System.out.println("\nTotal de números pares: " + totalPares);
		        System.out.println("Total de números ímpares: " + totalImpares);

		        scanner.close(); 
	
	
	}

}
