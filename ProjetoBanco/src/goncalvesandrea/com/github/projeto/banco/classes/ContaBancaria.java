package goncalvesandrea.com.github.projeto.banco.classes;

import goncalvesandrea.com.github.projeto.banco.interfaces.IDetalhesConta;

public class ContaBancaria implements IDetalhesConta{
	
	private String nome;
	private Double saldo;
	private String numero;
	private String tipo;
	

	public String getNome() {
		return this.nome;
	}

	public Double getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getTipo() {
		return this.tipo;
	}

	public ContaBancaria(String nome, Double saldo, String numero, String tipo) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;		
	}
	
	public void depositar(Double valor) {		
	//	Double taxa = 0.01;
	//	if (this.tipo.equals("PJ")) {			
	//		taxa = 0.02;
	//	} 
	//	Double desconto = valor * taxa;
		this.saldo += valor;	
	}

	@Override
	public void detalhes() {
		System.out.println("Conta: " + this.getNumero());
		System.out.println("Titular: " + this.getNome());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getSaldo());		
	}
}