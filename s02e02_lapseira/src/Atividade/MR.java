package Atividade;

import java.util.Scanner;
public class MR {

	int nPessoas = 0;
    int maxPessoas = 4;
    static int ingresso = 0;
    int maxVolta = 1;
    boolean embarcar(){
        if (this.nPessoas < this.maxPessoas){
            this.nPessoas += 1;
            System.out.println("embarcou");
            return true;
        }
        System.out.println("ta Cheio");
        return false;
    }

    void comprarIngresso(float ingresso){
        this.ingresso += ingresso;
        if(this.ingresso > this.maxVolta)
            this.ingresso = this.maxVolta;
    }

    void andar(Float andando){
        if(this.nPessoas == 0){
            System.out.println("Não tem passageiros");
            return;
        }
        if(this.ingresso >= andando){
            this.ingresso -= andando;
            System.out.println("Diversão");
            return;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MR mr = new MR();
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            
            }else if(ui[0].equals("init")) {
				int potencia = Integer.parseInt(ui[1]);
	
            }else if(ui[0].equals("embarcar")){
                mr.embarcar();
            }else if(ui[0].equals("ingresso")){
                float compra = Float.parseFloat(ui[1]);
                mr.comprarIngresso(ingresso);
            }else if(ui[0].equals("andar")){
               Float andando = Float.parseFloat(ui[1]);
                mr.andar(andando);
            }else {
            	System.out.println("Comando invalido");
            }
        }
        scanner.close();
    }


}
