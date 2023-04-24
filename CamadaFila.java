package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CamadaFila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		 do {
	            System.out.println("\n---- Banco ----");
	            System.out.println("1 - Adicionar cliente na fila");
	            System.out.println("2 - Listar clientes na fila");
	            System.out.println("3 - Chamar próximo cliente");
	            System.out.println("0 - Sair");
	            System.out.print("Opção escolhida: ");
	            opcao = sc.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nome = sc.next();
	                    fila.add(nome);
	                    System.out.println("Cliente " + nome + " adicionado na fila.");
	                    break;
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila: " + fila);
	                    }
	                    break;
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        String proximoCliente = fila.poll();
	                        System.out.println("Próximo cliente: " + proximoCliente);
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	            
	        } while (opcao != 0);
	        
	        sc.close();
	}

}
