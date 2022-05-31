package Tipos;

public class Telefone {
	private String ddd;
	private String telefone;
	public Telefone(String ddd, String telefone) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone, String ddd) {
		this.telefone = telefone;
		this.ddd = ddd;
	}
	@Override
	public String toString() {
		return ddd + telefone;
	}
}
