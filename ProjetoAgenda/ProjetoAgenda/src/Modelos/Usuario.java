package Modelos;

import java.util.List;

import Tipos.Nome;
import Tipos.Telefone;

public class Usuario {
	private String nome;
	private String telefone;
	private String sobrenome;
	private List<Contato> contato;
	public Usuario(String nome, String sobrenome, List<Contato> contato) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public List<Contato> getContato() {
		return contato;
	}
	
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return " Nome: " + nome + " " + sobrenome + "\ncontato:" + contato;
	}
	
}