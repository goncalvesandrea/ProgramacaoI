package goncalvesandrea.com.github;

public class Programa {
	
	public static void main(String[] args) {
	
		Conta conta1 = new Conta("João da Silva", 789.99, "123456", "PF");
		conta1.saldoAtualizado();
		conta1.deposito(100.0);
			System.out.println("Deposito realizado no valor de R$: " + (conta1.deposito(100.0)));
			System.out.println("\nSaldo atualizado : R$ " + (conta1.saldoAtualizado()));
		conta1.saque(500.0);
			System.out.println("\nSaque realizado no valor de R$: " + (conta1.saque(500)));
			System.out.println("\nSaldo atualizado : R$ " + (conta1.saldoAtualizado()));
	}
}