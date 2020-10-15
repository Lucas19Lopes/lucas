package s03e01_motoca;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Moto moto  = new Moto(2);
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) {
				int potencia = Integer.parseInt(ui[1]);
				moto = new Moto(potencia); 
			
			}else if(ui[0].equals("embarcar")) {
				int idade = Integer.parseInt(ui[2]);
				moto.embarcar(new Pessoa(ui[1], idade));
				
			}else if(ui[0].equals("desembarcar")) {
				int idade = Integer.parseInt(ui[2]);
				moto.desembarcar();
			
			}else if(ui[0].equals("dirigir")) {
				moto.dirigir(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("pagar")) {
				moto.pagar(Integer.parseInt(ui[1]));
				
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();
	}

}
 

