package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   LUIZ INFO SHOP                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar conta                          ");
			System.out.println("            2 - Listar produtos disponíveis          ");
			System.out.println("            3 - Adicionar ao carrinho                ");
			System.out.println("            4 - Efetuar pedido                       ");
			System.out.println("            5 - Atualizar dados da conta             ");
			System.out.println("            6 - Apagar Conta                         ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("O que deseja fazer agora?                            ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nQue pena não ter pedido nada, LUIZ INFO SHOP espera ajudar na próxima!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					break;
				case 2:
					System.out.println("Listar produtos disponíveis\n\n");

					break;
				case 3:
					System.out.println("Adicionar ao carrinho - em pilha\n\n");

					break;
				case 4:
					System.out.println("Efetuar pedido\n\n");

					break;
				case 5:
					System.out.println("Atualizar dados da conta\n\n");

					break;
				case 6:
					System.out.println("Apagar Conta\n\n");

					break;
					
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
}