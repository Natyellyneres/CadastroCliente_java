package cadastro;

import java.util.ArrayList;
//Classe que representa os pacientes da clinica, contendo informacoes pessoas basicas
public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String dataNascimento;
    
   public static ArrayList<Paciente> listaPacientes = new ArrayList<>();

    //Construtor para inicializar a classe
    public Paciente(String nome, String cpf, String telefone, String email, String endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    	//Metodos getters e setters 
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		//toString para exibir as informacoes do paciente
		@Override
		public String toString() {
		    return "Paciente[nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", endereco=" + endereco+ ", data de nascimento=" + dataNascimento+"]";
		}

}
