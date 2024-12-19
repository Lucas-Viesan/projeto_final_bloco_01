package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
import biblioteca.model.Livro;
import biblioteca.model.LivroDidatico;
import biblioteca.controller.LivroController;

public class Menu {

	    public static void main(String[] args) {
	       
	        LivroController livroController = new LivroController();
	        
	        Scanner scan = new Scanner(System.in);
	        
	        String titulo, autor, id, disciplina;
	        int opcao = 0;
	        
	        while (true) {
	            System.out.println("*****************************************************");
	            System.out.println("                                                     ");
	            System.out.println("           BIBLIOTECA NACIONAL LUCAS VIEIRA          ");
	            System.out.println("                                                     ");
	            System.out.println("*****************************************************");
	            System.out.println("                                                     ");
	            System.out.println("            1 - Cadastrar Livro                      ");
	            System.out.println("            2 - Listar todos os Livros               ");
	            System.out.println("            3 - Buscar por ID                        ");
	            System.out.println("            4 - Atualizar Dados do Livro             ");
	            System.out.println("            5 - Remover Livro                        ");
	            System.out.println("            6 - Sair                                 ");
	            System.out.println("                                                     ");
	            System.out.println("*****************************************************");
	            System.out.println("Entre com a opção desejada:                          ");
	            System.out.println("                                                     ");
	            
	            try {
	                opcao = scan.nextInt();
	                scan.nextLine();
	            } catch (InputMismatchException e) {
	                System.out.println("\nDigite valores inteiros para a opção!");
	                scan.nextLine(); 
	                continue; 
	            }
	            
	            if (opcao == 6) {
	                System.out.println("\nBiblioteca nacional Lucas Vieira - Imagine seu futuro!");
	                scan.close();
	                System.exit(0);
	            }
	            
	            switch (opcao) {
	                case 1: 
	                    System.out.print("Título: ");
	                    titulo = scan.nextLine();
	                    System.out.print("Autor: ");
	                    autor = scan.nextLine();
	                    System.out.print("ID: ");
	                    id = scan.nextLine();
	                    System.out.print("O livro é didático? (s/n): ");
	                    String isDidatico = scan.nextLine();
	                    
	                    Livro livro;
	                    if (isDidatico.equalsIgnoreCase("s")) {
	                        System.out.print("Disciplina: ");
	                        disciplina = scan.nextLine();
	                        livro = new LivroDidatico(titulo, autor, id, disciplina);
	                    } else {
	                        livro = new Livro(titulo, autor, id) {};  
	                    }
	                    
	                    livroController.atualizar(livro);  
	                    System.out.println("Livro adicionado com sucesso!");
	                    break;
	                case 2:
	                    System.out.println("\nListar todos os livros:");
	                    livroController.listarTodos();
	                    break;
	                case 3: 
	                    System.out.print("ID do livro a ser buscado: ");
	                    id = scan.nextLine();
	                    livroController.procurarPorID(id);
	                    break;
	                case 4:  
	                    System.out.print("ID do livro a ser atualizado: ");
	                    id = scan.nextLine();
	                    System.out.print("Novo Título: ");
	                    String novoTitulo = scan.nextLine();
	                    System.out.print("Novo Autor: ");
	                    String novoAutor = scan.nextLine();
	                    System.out.print("O livro atualizado é didático? (s/n): ");
	                    isDidatico = scan.nextLine();

	                    Livro novoLivro;
	                    if (isDidatico.equalsIgnoreCase("s")) {
	                        System.out.print("Nova Disciplina: ");
	                        String novaDisciplina = scan.nextLine();
	                        novoLivro = new LivroDidatico(novoTitulo, novoAutor, id, novaDisciplina);
	                    } else {
	                        novoLivro = new Livro(novoTitulo, novoAutor, id) {};  
	                    }
	                    
	                    livroController.atualizar(novoLivro);  
	                    System.out.println("Livro atualizado com sucesso!");
	                    break;
	                case 5: 
	                    System.out.print("ID do livro a ser removido: ");
	                    id = scan.nextLine();
	                    livroController.deletar(id);  
	                    System.out.println("Livro removido com sucesso!");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }
	    }
	    
}