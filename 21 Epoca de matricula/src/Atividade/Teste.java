package Atividade;

public class Teste {

	public static void main(String[] args) {
		Gerentes gerente1 = new Gerentes();
		
		gerente1.setNome("Jason");
		gerente1.setRg("12323");
		gerente1.setCpf("123.876.654-23");
		gerente1.setDataDeNascimento("19/11/1993");
		
		
		Progamador progamador1 = new Progamador();
		
		progamador1.setNome("Jo�o");
		progamador1.setRg("123242323");
		progamador1.setCpf("776.123.632-27");
		progamador1.setDataDeNascimento("14/10/1997");
		
		Pesquisador pesquisador1 = new Pesquisador();
		
		pesquisador1.setNome("Mclovin");
		pesquisador1.setRg("12432543633");
		pesquisador1.setCpf("123.346.675-13");
		pesquisador1.setDataDeNascimento("11/12/1994");
		
		System.out.println("Nome do Gerente: " + gerente1.getNome());
		System.out.println("RG do Gerente: " + gerente1.getRg());
		System.out.println("CPF do Gerente: " + gerente1.getCpf());
		System.out.println("Data de Nascimento do Gerente: " + gerente1.getDataDeNascimento());
		
		System.out.println("Nome do Progamador: " + progamador1.getNome());
		System.out.println("RG do Progamador: " + progamador1.getRg());
		System.out.println("CPF do Progamador: " + progamador1.getCpf());
		System.out.println("Data de Nascimento do Progamador: " + progamador1.getDataDeNascimento());
		
		System.out.println("Nome do Pesquisador: " + pesquisador1.getNome());
		System.out.println("RG do Pesquisador: " + pesquisador1.getRg());
		System.out.println("CPF do Pesquisador: " + pesquisador1.getCpf());
		System.out.println("Data de Nascimento do Pesquisador: " + pesquisador1.getDataDeNascimento());
		
		
		
		Projeto projeto1 = new Projeto();
		
		projeto1.setNomeDoProjeto("Panteras");
		projeto1.setDataDeInicio("19/02/1999");
		
		System.out.println("Nome do Projeto: " + projeto1.getNomeDoProjeto());
		System.out.println("Data de Inicio do Projeto: " + projeto1.getDataDeInicio());
		System.out.println("Or�amento do Projeto em R$: " + projeto1.retornaOrcamento(10000));
		
		gerente1.setProjeto(projeto1);
		gerente1.contratarPesquisador(pesquisador1);
		gerente1.contratarProgamador(progamador1);
		
		
		System.out.println(projeto1);
		gerente1.demitirPesquisador();
		gerente1.demitirProgamador();
		
		System.out.println(projeto1);
		
		
		
		

	}

}
