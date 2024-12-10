package cadastro;

import java.util.ArrayList;

public class Consulta {
    private Paciente paciente;
    private Dentista dentista;
    private String dataConsulta;
    private String descricao;

    
    public static ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public Consulta(Paciente paciente, Dentista dentista, String dataConsulta, String descricao) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataConsulta = dataConsulta;
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente ) {
		this.paciente = paciente;
	}
	
	public Dentista getDentista() {
		return dentista;
	}
	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}
	
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
	    return "Consulta[paciente=" + paciente + ", dentista=" + dentista + ", dataConsulta=" + dataConsulta + ", descricao=" + descricao + "]";
	}
	
	
}
