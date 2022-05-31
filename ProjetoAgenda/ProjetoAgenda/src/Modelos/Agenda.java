package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Usuario> contatos = new ArrayList<Usuario>();
	
	public Agenda(List<Usuario> contatos) {
		this.contatos = contatos;
	}

	public List<Usuario> getContatos() {
		return contatos;
	}

	public void setContatos(List<Usuario> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "\nContatos: \n" + contatos + "\n";
	}
	
}