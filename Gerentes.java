package Atividade;

//import basico.Empregados;

public class Gerentes extends Empregados{


	
	private Projeto projeto;
	
	
	public double retornarSalario(double salario) {
		return salario*1.5;
	}

	public void contratarProgamador(Progamador progamador) {
		if (projeto.getProgamador() == null) {
			projeto.setProgamador(progamador);
		}
		else {
			System.out.println("O projeto já possui um programador");
		}
	}
	
	public void contratarPesquisador(Pesquisador pesquisador) {
		if (projeto.getPesquisador() == null) {
			projeto.setPesquisador(pesquisador);
		}
		
		else {
			System.out.println("O projeto já possui um pesquisador");
		}
	}
	
	public void demitirProgamador() {
		projeto.setProgamador(null);
	}
	public Projeto getProjeto() {
		return projeto;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	public void demitirPesquisador() {
		projeto.setPesquisador(null);
	}
}
