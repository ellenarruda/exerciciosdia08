package javanaveia;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class collectionfila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> filaClientes = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpar o buffer do scanner

	            switch (opcao) {
	                case 1:
	                    adicionarCliente(filaClientes, scanner);
	                    break;
	                case 2:
	                    listarClientes(filaClientes);
	                    break;
	                case 3:
	                    chamarCliente(filaClientes);
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);
	    }

	    private static void exibirMenu() {
	        System.out.println("\nMenu:");
	        System.out.println("1: Adicionar um novo Cliente na fila");
	        System.out.println("2: Listar todos os Clientes na fila");
	        System.out.println("3: Chamar (retirar) uma pessoa da fila");
	        System.out.println("0: Sair");
	        System.out.print("Digite uma opção: ");
	    }

	    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
	        System.out.print("Digite o nome: ");
	        String nomeCliente = scanner.nextLine();
	        filaClientes.add(nomeCliente);
	        System.out.println("\nFila: " + filaClientes + "\nCliente Adicionado!");
	    }

	    private static void listarClientes(Queue<String> filaClientes) {
	        System.out.println("\nLista de Clientes na Fila: " + filaClientes);
	    }

	    private static void chamarCliente(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("\nA Fila está vazia!");
	        } else {
	            String clienteChamado = filaClientes.poll();
	            System.out.println("\nFila: " + filaClientes + "\nO Cliente " + clienteChamado + " foi Chamado!");
	        }
	    
	
	}

}
