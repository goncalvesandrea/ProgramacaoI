package programa;

import java.util.Scanner;

import Operacoes.Divisao;
import interfaces.ICalculadora;
public class ExemploPrograma {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja ? [1 - Teste]");
		int opc = scan.nextInt(); // le a entrada do terminal
		
		if(opc == '+') {
			System.out.println("Digite o numero que deseja somar? ");
			Double num1 = scan.nextDouble();
			System.out.println("Digite o numero que deseja somar? ");
			Double num2 = scan.nextDouble();
			ICalculadora calculadora = new Soma(num1 + num2);
		}
		
		else if(opc == '-') {
			System.out.println("Digite o numero que deseja subtrair? ");
			Double num1 = scan.nextDouble();
			System.out.println("Digite o numero que deseja subtrair? ");
			Double num2 = scan.nextDouble();
			ICalculadora calculadora = new subtrair(num1 - num2);
		}
		
		else if(opc == '*') {
			System.out.println("Digite o numero que deseja multiplicar? ");
			Double num1 = scan.nextDouble();
			System.out.println("Digite o numero que deseja multiplicar? ");
			Double num2 = scan.nextDouble();
			ICalculadora calculadora = new multiplicar(num1 * num2);
		}
		
		else if(opc == '/') {
			System.out.println("Digite o numero que deseja dividir? ");
			Double num1 = scan.nextDouble();
			System.out.println("Digite o numero que deseja dividir? ");
			Double num2 = scan.nextDouble();
			Divisao calculadora = new Divisao(num1 / num2);
		}
		else {
			System.out.println("Operacao invalida");
		}

		
		scan.close();
	
		
	}
}
