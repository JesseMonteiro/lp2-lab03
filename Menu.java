package lab03_Jesse_Monteiro_Ferreira;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * Classe sistema para criar um objeto agenda e operar sobre ela
 * 
 * @author Jesse Montero Ferreira - 118210282
 *
 */
public class Menu {
		
	public static void main (String[] args) {
		
		String opcao;

		Agenda agenda = new Agenda();
		
		String nome, sobrenome, telefone;
		int posicao;
		
		opcaoMenu();


		/**
		 * Laço de repetição que vai executar o programa
		 */
		while (true) {
			Scanner read  = new Scanner(System.in);	
			opcao = read.next().toUpperCase();

			/**
			 * lançando exceção para opcao nulo
			 */
			if (opcao == null) {
				throw new NullPointerException();

			}
		
			if (opcao.equals("C") || opcao.equals("L") || opcao.equals("E") || opcao.equals("S")) {
				
				if (opcao.equals("S")) {
					break;
				} 
				switch (opcao) {
					case "C":
						System.out.print("Posiçao: ");
						
						posicao = read.nextInt();
						read.nextLine();
						if (posicao < 1 || posicao > 100) {
							System.out.println("POSIÇÃO INVÁLIDA");
							
							break;
						}
						System.out.print("Nome: ");
						nome = read.nextLine();
						System.out.print("Sobrenome: ");
						sobrenome = read.nextLine();
						System.out.print("Telefone: ");
						telefone = read.nextLine();
						if (agenda.cadastrarContato(posicao, nome, sobrenome, telefone) ) {
							System.out.println("CADASTRO REALIZADO!");
						}
						break;
					case "L" :
						System.out.println(agenda.listarContatos() );
						break;
					case "E" : 
						System.out.print("Posiçao: ");
						posicao = read.nextInt();
						read.nextLine();
						System.out.println(agenda.exibirContato(posicao));
						break;
				}
			
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			
			opcaoMenu();
			opcao = read.nextLine().toUpperCase();
			
		}
	
	}
	
	
	/**
	 * Bloco do menu que é exibido a cada reinicio do laço
	 */
	public static void opcaoMenu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air");
		System.out.println("Opção> ");
		
	}
		
}