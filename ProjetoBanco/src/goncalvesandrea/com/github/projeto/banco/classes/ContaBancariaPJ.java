package goncalvesandrea.com.github.projeto.banco.classes;

public class ContaBancariaPJ extends ContaBancaria {

	public ContaBancariaPJ(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}
	
	@Override
	public void depositar(Double valor) {
		Double taxa = 0.02;
		Double desconto = valor * taxa;
		Double saldo = valor - desconto;
		this.setSaldo(saldo);	
	}
}