package cadastro;

import java.util.ArrayList;

//Dentista.java
public class Dentista {
 private String nome;
 private String telefone;
 private String email;

 public static ArrayList<Dentista> listaDentistas = new ArrayList<>();
 
 public Dentista(String nome, String telefone, String email) {
     this.nome = nome;
     this.telefone = telefone;
     this.email = email;
 }

 	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
	    return "Dentista[nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
}
