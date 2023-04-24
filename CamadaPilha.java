package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class CamadaPilha {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack<String> pilha = new Stack<>();

	        int opcao;
	        do {
	            System.out.println("\nMENU");
	            System.out.println("1 - Adicionar um novo livro");
	            System.out.println("2 - Listar todos os livros da pilha");
	            System.out.println("3 - Retirar um livro da pilha");
	            System.out.println("0 - Sair do programa");
	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1:
	                    sc.nextLine();
	                    System.out.print("Digite o nome do livro: ");
	                    String nome = sc.nextLine();
	                    pilha.push(nome);
	                    System.out.println("Livro " + nome + " adicionado na pilha.");
	                    break;
	                case 2:
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha: ");
	                        for (String livro : pilha) {
	                            System.out.println(livro);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        String livro = pilha.pop();
	                        System.out.println("Livro " + livro + " retirado da pilha.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 0);

	        sc.close();
	    }
	}   