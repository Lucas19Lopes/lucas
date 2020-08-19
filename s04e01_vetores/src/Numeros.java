import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] agrs) {
		ArrayList<Integer> nun = new ArrayList<Integer>();
		while(true){
			String line = scan.nextLine();
			String ui[] = line.split(" ");
			String cmd = ui[0];

			if(line.equals("end")){
				break;
			}else if(cmd.equals("mst")){
				System.out.print("[ ");
				for(Integer value : nun)
					System.out.print(value + " ");
				System.out.print("]\n");
			}else if(cmd.equals("org")){
				
				System.out.print("[ ");
				for(int i = nun.size() - 1; i >= 0; --i)
					System.out.print(nun.get(i) + " ");
				System.out.print("]\n");
				
			}else if(cmd.equals("add")){
				for(int i = 1; i < ui.length; i++)
					nun.add(Integer.parseInt(ui[i]));
			}else if(cmd.equals("find")){
				
				System.out.print("[ ");
				for(int i = 1; i < ui.length; i++)
					System.out.print(nun.indexOf(Integer.parseInt(ui[i])) + " ");
				System.out.print("]\n");
				
			}else if(cmd.equals("inserir")){
				
				int ind = Integer.parseInt(ui[1]);
				int value = Integer.parseInt(ui[2]);
				if(ind < 0)
					continue;
				if(ind > nun.size())
					ind = nun.size();
				nun.add(ind, value);
				
			}else if(cmd.equals("rmp")){
				
				int ind = Integer.parseInt(ui[1]);
				if((ind < 0) || (ind >= nun.size()))
					System.out.println("erro");
				else
					nun.remove(Integer.parseInt(ui[1]));
				
			}else if(cmd.equals("rm")){
				
				int value = Integer.parseInt(ui[1]);
			    for (int i = 0; i < nun.size(); i++) {
			        if (value == nun.get(i)) {
			            nun.remove(i);
			            i--;
			        }
			    }
			   
			}else {
				System.out.print("fail: command not found\n");
			}
	}
	}
}
