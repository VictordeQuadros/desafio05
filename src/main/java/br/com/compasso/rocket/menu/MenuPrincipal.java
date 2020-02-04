package br.com.compasso.rocket.menu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

import br.com.compasso.rocket.cadastros.CadastraCliente;
import br.com.compasso.rocket.modelo.Cliente;

public class MenuPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer opcao;
		Boolean rodando = true;
		Collection<Cliente> clientes = new HashSet<Cliente>();
		CadastraCliente cadastro = new CadastraCliente();
		
		do {
			printaMenu();
			opcao = Integer.parseInt(sc.nextLine());

			switch (opcao) {
				case 1:
					//Verificar Estoque
					
					do {
						
						printaMenuInterno("Gostaria de verificar o estoque novamente?");
						if(Integer.parseInt(sc.nextLine()) == 1)
							rodando = true;
						else
							rodando = false;
							
					}while(rodando);
					rodando = true;	
					break;
						
				case 2:
					//Realizar Pedido
					
					do {
						
						printaMenuInterno("Gostaria de realizar outro pedido?");
						if(Integer.parseInt(sc.nextLine()) == 1)
							rodando = true;
						else
							rodando = false;
							
					}while(rodando);
					rodando = true;	
					break;
				case 3:
					//Cadastrar Produto
					
					do {
						
						printaMenuInterno("Gostaria de cadastrar outro produto?");
						if(Integer.parseInt(sc.nextLine()) == 1)
							rodando = true;
						else
							rodando = false;
							
					}while(rodando);
					rodando = true;	
					break;
				case 4:
					//Cadastrar Cliente
					do {
						
						cadastro.Cadastro();
						printaMenuInterno("Gostaria de cadastrar outro cliente?");
						if(Integer.parseInt(sc.nextLine()) == 1)
							rodando = true;
						else
							rodando = false;
							
					}while(rodando);
					rodando = true;	
					break;
				case 5:
					System.out.println("Saindo do programa.");
					System.out.println("Até mais.");
					rodando = false;
					sc.close();
					break;
				default:
					System.out.println("Opcao Invalida Tente Novamente.");
					break;
			}

		} while (rodando);

		
	}

	private static void printaMenu() {
		System.out.println("_____________________________________");
		System.out.println("## Escolha uma das opçoes a baixo ##");
		System.out.println("Opcao 1 - Verificar Estoque");
		System.out.println("Opcao 2 - Realizar Pedido");
		System.out.println("Opcao 3 - Cadastrar Produto");
		System.out.println("Opcao 4 - Cadastrar Cliente");
		System.out.println("Opcao 5 - Sair");
		System.out.println("_____________________________________");
		System.out.println("Digite a Opção: ");
	}
	private static void printaMenuInterno(String caso) {
		
		System.out.println(caso);
		System.out.println("Digite 1 para SIM ou Qualquer outra tecla para NÃO");
	}
}
