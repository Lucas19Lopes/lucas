import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato contato = new Contato("");
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }
            else if(ui[0].equals("init")){
                contato = new Contato(ui[1]);
            }
            else if(ui[0].equals("add")){
                contato.addTelefone(ui[1], ui[2]);
            }
            else if(ui[0].equals("rm")){
                contato.rmTelefone(Integer.parseInt(ui[1]));
            }
            else if(ui[0].equals("show")){
                System.out.println(contato);
            }
            else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}