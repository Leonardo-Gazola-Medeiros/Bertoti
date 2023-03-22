package models;

public class Aluno {

	private int ra;
	private String nome;
	private String sexo;
	private String cpf;
	private String dataNasc;
	
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc.getData();
	}
	
	public Aluno(int ra, String nome, String sexo, String cpf, Data dataNasc) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dataNasc = dataNasc.getData();
	}
	@Override
	public String toString() {
		return "Aluno [ra=" + ra 
				+ ", nome=" + nome 
				+ ", sexo=" + sexo 
				+ ", cpf=" + cpf 
				+ ", dataNasc=" + dataNasc
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



