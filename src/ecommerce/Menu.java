package ecommerce;


import ecommerce.model.Ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.controller.EcommerceController;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		float preco;
		String tipo, nome, numeroSerie;
		
		EcommerceController ecommerce = new EcommerceController();

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   LUIZ INFO SHOP                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar produto                        ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Efetuar pedido                       ");
			System.out.println("            4 - Apagar produto                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("O que deseja fazer agora?                            ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println("\nQue pena não ter pedido nada, LUIZ INFO SHOP espera ajudar na próxima!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar produto\n\n");
					System.out.println("Digite o tipo do produto: ");
					tipo = leia.next();
					System.out.println("Digite o nome da marca: ");
					nome = leia.next();
					System.out.println("Digite o preço do produto: ");
					preco = leia.nextFloat();
					System.out.println("Digite o número de série do produto: ");
					numeroSerie = leia.next();
					break;
				case 2:
					System.out.println("Listar produtos\n\n");
					ecommerce.ListarProdutos();
					break;
				case 3:
					System.out.println("Efetuar pedido\n\n");

					break;
				case 4:
					System.out.println("Apagar produto\n\n");

					break;
					
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
}