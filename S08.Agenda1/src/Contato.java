import java.util.ArrayList;

public class Contato {
	public String nome; 
	ArrayList<Telefone> telefone;
	
	public Contato(String nome) {
		this.nome = nome;
		telefone = new ArrayList<>();
	}
	
	public String getNome(){
		return nome;
	}
	
	public String toString() {
		String saida =  "- " +this.nome;
		 if(telefone.size() > 0)
	            saida += " ";
	        for(int i = 0; i < telefone.size(); i++){
	        	 Telefone telefones = telefone.get(i);
	             saida += "[" + i + ":" +  telefone + "]";
	        }
	        return saida;

}

    public void addTelefone(String id, String numero){   
    	if(Telefone.validar(numero))
            telefone.add(new Telefone(id, numero, 0));
        else
            System.out.println("Erro: Impossivel");
    }

    public void rmTelefone(int indice){
        if(indice < 0 || indice >= telefone.size())
            return;
        telefone.remove(indice);
    }
}
