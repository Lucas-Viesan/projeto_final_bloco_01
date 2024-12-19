package biblioteca;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           BIBLIOTECA NACIONAL LUCAS VIEIRA          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Livro                      ");
			System.out.println("            2 - Listar todas os Livros               ");
			System.out.println("            3 - Buscar por ID                        ");
			System.out.println("            4 - Atualizar Dados do Livro             ");
			System.out.println("            5 - Remover Livro                        ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = scan.nextInt();
			
			if (opcao == 6) {
				System.out.println("\nBiblioteca nacional Lucas Vieira - Imagine seu futuro!");
                 scan.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Livro\n\n");

				break;
			case 2:
				System.out.println("Listar todos os Livros\n\n");

				break;
			case 3:
				System.out.println("Consultar por ID \n\n");

				break;
			case 4:
				System.out.println("Atualizar dados do Livro\n\n");

				break;
			case 5:
				System.out.println("Remover Livro \n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		
			}
		}	
	}
}

