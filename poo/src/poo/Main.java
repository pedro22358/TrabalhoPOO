package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int opcao = 1;
		ServicoStreaming servico = new ServicoStreaming();
		
		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1 - Logar");
			System.out.println("2 - cadastrar");
			System.out.println("3 - Remover Cliente");
			System.out.println("4 - Buscar Midia");
			System.out.println("5 - Deslogar");
			System.out.println("0 - Sair");

			opcao = ent.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o usuário:");
				String usuario = ent.nextLine();
				ent.nextLine();
				System.out.println("Digite a senha:");
				String senha = ent.nextLine();
				servico.logar(usuario, senha);
			}
			case 2:
				System.out.println("Digite o usuário");
				
		}
	}

}
