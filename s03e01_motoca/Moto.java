package s03e01_motoca;

public class Moto {
	Pessoa pessoa;
	int potencia;
	int tempo;

public Moto(int potencia){
	this.potencia = potencia;
	}


	void pagar(int value) {
		this.tempo += value;
	}


	void embarcar(Pessoa pessoa) {
		if(this.pessoa == null)
			this.pessoa = pessoa;
		else
			System.out.println("Ja tem gente na Moto");
	}
	
	void desembarcar() {
		if(this.pessoa != null)
			this.pessoa = null;
		else
			System.out.println("Nao tem ninguem na moto");
	}

	void dirigir(int tempo){
		if(this.pessoa == null) {
			System.out.println("Não tem ninguem na moto");
			return;
		}
		
		if (this.tempo  < tempo) {
			System.out.println("COMPRE MAIS MINUTOS");
			return;
		}
		if(this.pessoa.idade < 2)
			System.out.println("Muio novo ");
		else if(this.pessoa.idade > 10)
			System.out.println("Muito grande pra andar de moto");
		else {
			this.tempo -= tempo;
			System.out.print(this.pessoa.nome + " "  + this.fazerBarulho());
		}
		}
		
	
	String fazerBarulho() {
		String out = ""; 
		for(int i = 0 ; i < this.potencia; i++)
			out += "RUM";
		return out;
	}
}
