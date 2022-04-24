package Operacoes;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora {
	private Double[] numeros;
	private int n1;
	private int n2;
	// construtor
	public Divisao(Double[] numeros) {
		this.numeros = numeros;
	}
	@Override
	public Integer calcula(Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
		return n1 / n2;
	}
	@Override
	public Float calcula(Float n1, Float n2) {
		this.n1 = n1;
		this.n2 = n2;
		return n1 / n2;
	}
	@Override
	public Double calcula(Double n1, Double n2) {
		this.n1 = n1;
		this.n2 = n2;
		return n1 / n2;
	}
	@Override
	public Integer calcula(Integer[] numeros) {
		for(int i = 0; i <= numeros.length; i++) {
			i + numeros[i];
		}
	}
	@Override
	public Float calcula(Float[] numeros) {
		
	}
	@Override
	public Double calcula(Double[] numeros) {
		
	}
	
	
		
}


