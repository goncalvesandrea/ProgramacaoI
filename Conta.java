package goncalvesandrea.com.github;

public class Conta {
	public String cliente;
	public double saldo;
	public String numeroConta;
	public String tipoConta;
	public Integer qtdeSaque = 0;
	
	public Conta(String cliente, double saldo, String numeroConta, String tipoConta) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
	}
	
	public double deposito(double valor) {
		saldo += valor;
		if(tipoConta == "PF") {
			valor -= valor*0.01;
		}else if (tipoConta == "PJ") {
			valor -= valor*0.02;
		}else {
			System.out.println("ERRO");
		}
		return valor;
	}
	
	public double saque(double valor) {
		if (valor > saldo && tipoConta == "PF") {
			valor = 0.0;
			System.out.println("Valor solicitado maior que o saldo em conta.");
		}else{
			saldo = saldo - valor;
				if(qtdeSaque > 3) {
					if(tipoConta == "PF")
					valor = valor - (valor*0.01);
				}else {
					valor = valor - (valor*0.02);
			}
		}
		return valor;
	}
public double saldoAtualizado() {
		return saldo;
	}
}
