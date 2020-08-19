
public class Telefone {
	public String id;
	public String numero;
	
	public Telefone(String id, String numero, int indice) {
		this.id = id;
		this.numero= numero;
		
	}
	
	public String toString() {
		return this.id + ":" + this.numero;
	}
	
	
	 public static boolean validar(String numero){
	        String validar = "0123456789().-";
	        for(int i = 0; i < numero.length(); i++){
	            char c = numero.charAt(i);
	            if(validar.indexOf(c) == -1)
	                return false;
	        }
	        return true;
	    }

	public Telefone get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
