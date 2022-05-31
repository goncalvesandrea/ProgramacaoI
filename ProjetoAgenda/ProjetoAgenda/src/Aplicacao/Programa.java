package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelos.Agenda;
import Modelos.Contato;
import Modelos.Usuario;
import Tipos.Email;
import Tipos.Nome;
import Tipos.Telefone;

public class Programa {
	public static void main(String[] args) {
		Integer opc = 1;
		Scanner scan = new Scanner(System.in);
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		Agenda agenda = new Agenda(listaUsuario);
			opc = menu();
			
			switch(opc) {
			
			case 1:
			Integer opcao;

			System.out.println("Digite o nome do contato: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o sobrenome: ");
			String sobrenome = scan.nextLine();
			
			List<Contato> listaContatos = new ArrayList<>();
			
			Usuario newUsuario = new Usuario(nome, sobrenome, listaContatos);
			
			listaUsuario.add(newUsuario);
			
			do {
				System.out.println("Digite um email se tiver: ");
				String email = scan.nextLine();
				
				System.out.println("Digite o DDD do telefone: ");
				String ddd = scan.nextLine();
				
				System.out.println("Digite o telefone: ");
				String telefone = scan.nextLine();
				
				Contato novoContato = new Contato( email, ddd, telefone);
				
				listaContatos.add(novoContato);
				
				System.out.println("Deseja adicionar mais contatos a essa pessoa? 1-SIM 0-NAO ");
				opcao = scan.nextInt();
				scan.nextLine();
				
			} while (opcao == 1);
			
			System.out.println("Cadastrado com sucesso");
			break;
			
			case 2:
				listaUsuario.forEach(x -> System.out.println(x.getNome()));
				listaUsuario.forEach(x -> System.out.println(x.getSobrenome()));
				
				break;
			
			case 3:
				
				break;
			case 4:
				 
				break;
			
			default:
			System.out.println("Finalizando a aplicação...");
			System.exit(0);
			break;
			}
		}while(opc != 0);
	}
	
	public static Integer menu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Agenda   ===============\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para Cadastrar o contatos \n");
		sb.append("Digite 2 para Verificar os contatos cadastrados\n");
		sb.append("Digite 3 para Ver detalhes de um usuário \n");
		sb.append("Digite 4 para deletar um contato \n");
		sb.append("Digite 5 para editar um contato \n");
		sb.append("Digite 0 para sair \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		return opc;
	}
}
}