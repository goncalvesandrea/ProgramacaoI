package Modelos;

import Tipos.Email;
import Tipos.Nome;
import Tipos.Telefone;

public class Contato {
		private String Telefone;
		private String Email;
		private String Ddd;
		
		public Contato( String telefone, String email, String ddd) {
			super();
			Telefone = telefone;
			Email = email;
			Ddd = ddd;
		}
		public String getTelefone() {
			return Telefone;
		}
		public String getDdd() {
			return Ddd;
		}
		public void setTelefone(String telefone) {
			Telefone = telefone;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}

		@Override
		public String toString() {
			return " Email " + Email + " telefone: " + Ddd + Telefone + " \n"; 
		}

	}