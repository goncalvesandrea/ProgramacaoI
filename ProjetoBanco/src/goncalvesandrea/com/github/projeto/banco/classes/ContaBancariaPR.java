package goncalvesandrea.com.github.projeto.banco.classes;

public class ContaBancariaPR extends ContaBancaria {

	private Integer saquesDisponiveis;
	
	public ContaBancariaPR(String nome, Double saldo, String numero, String tipo, String porte) {
		super(nome, saldo, numero, tipo);
		this.saquesDisponiveis = 3;
	}

	@Override
	public void sacar(Double valor) {
		
		if (valor > this.getSaldo()) {
			System.err.println("Valor solicitado maior que o saldo");
			return;
		}
		if (this.saquesDisponiveis < 1) {
			Double taxa = 0.015;
			Double desconto = valor * taxa;
			Double saldo = valor + desconto;
			this.setSaldo(saldo);
			return;
		} 
		
		super.sacar(valor);
		
	}
	
	@Override
	public void depositar(Double valor) {
		
		if(valor > 1000.00) {
		Double taxa = 0.008;
		Double desconto = valor * taxa;
		Double saldo = valor - desconto;
		this.setSaldo(saldo);
		return;
		}
		super.depositar(valor);
	}
}
