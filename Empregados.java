package Atividade;

public class Empregados {
	private String nome;
	private String rg;
	private String cpf;
	private String dataDeNascimento;
	private double salario;
	
	@Override
	public String toString() {
		return "Empregados [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento
				+ ", salario=" + salario + "]";
	}

	public String getNome() {
		return this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return this.rg = rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
		
	}
	
	public String getCpf() {
		return this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		}
	
	public String getDataDeNascimento() {
		return this.dataDeNascimento = dataDeNascimento;
		}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	public double retornarSalario(double salario) {
		return salario; 
	}
	

}
