package javanaveia;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int idade;
	        int totalMenorQue21 = 0;
	        int totalMaiorQue50 = 0;

	        System.out.println("Digite as idades (digite uma idade negativa para finalizar):");

	        // Loop de leitura das idades
	        while (true) {
	            System.out.print("Digite uma idade: ");
	            idade = scanner.nextInt();

	            // Verifica se a idade é negativa para encerrar o loop
	            if (idade < 0) {
	                break;
	            }

	            // Contagem de pessoas menores que 21 anos
	            if (idade < 21) {
	                totalMenorQue21++;
	            }

	            // Contagem de pessoas maiores que 50 anos
	            if (idade > 50) {
	                totalMaiorQue50++;
	            }
	        }

	        // Exibição dos resultados
	        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenorQue21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiorQue50);

	        scanner.close();
		 }
	}


