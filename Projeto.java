package Atividade;

public class Projeto {
	private Gerentes gerente;
	private Progamador progamador;
	private Pesquisador pesquisador;
	private String nomeDoProjeto;
	private String dataDeInicio;
	private double orcamento;
	
	
	public Gerentes getGerente() {
		return gerente;
	}
	public void setGerente(Gerentes gerente) {
		this.gerente = gerente;
	}
	public Progamador getProgamador() {
		return progamador;
	}
	public void setProgamador(Progamador progamador) {
		this.progamador = progamador;
	}
	public Pesquisador getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	public String getNomeDoProjeto() {
		return nomeDoProjeto;
	}
	public void setNomeDoProjeto(String nomeDoProjeto) {
		this.nomeDoProjeto = nomeDoProjeto;
	}
	public String getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	
	public double retornaOrcamento(double orcamento) {
		return orcamento*1;
		
	}
	
	
	
	
	
	
	
	
	
	
}