package goncalvesandrea.com.github.projeto.banco.apps;

import goncalvesandrea.com.github.projeto.banco.classes.ContaBancaria;

public class Programa {
	
	public static void main(String args[]) {
		ContaBancaria conta1 = new ContaBancaria("João da Silva", 789.99, "123456", "PJ");

		conta1.depositar(100.0);
		conta1.detalhes();
		
		conta1.sacar(500.0);
		conta1.detalhes();
		
		conta1.sacar(500.0);
		conta1.detalhes();
		
		conta1.sacar(500.0);
		conta1.detalhes();
		
		conta1.sacar(500.0);
		conta1.detalhes();
	}
}
