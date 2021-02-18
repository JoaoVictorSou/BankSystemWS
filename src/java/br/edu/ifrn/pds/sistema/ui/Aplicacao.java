package br.edu.ifrn.pds.sistema.ui;

import java.util.ArrayList;
import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;
import br.edu.ifrn.pds.sistema.negocio.*;
public class Aplicacao {
	
	private static IFachada fachadaConta = new FachadaConta();
	
	public static void main(String[] args) {
		Conta conta1 = new Conta("João", 200, 1225, "12");
		Conta conta2 = new Conta("Josefa", 200, 1225, "13");
		Conta conta3 = new Conta("Rayane", 200, 1225, "16");
		Conta conta4 = new Conta("Lorença", 200, 1225, "17");
		Conta conta5 = new Conta("Laurete", 200, 1225, "18");
		
		//Neste processo est]ao sendo insiridos no sistema os objetos criados acima.
		fachadaConta.inserirConta(conta1);
		fachadaConta.inserirConta(conta1);
		fachadaConta.inserirConta(conta2);
		fachadaConta.inserirConta(conta3);
		fachadaConta.inserirConta(conta4);
		fachadaConta.inserirConta(conta5);
		
		System.out.println("------------------------------------------------------------");
		
		//Neste processo estão sendo imprimidas todas as contas
		for (int i = 0 ; i < fachadaConta.buscarTodos().size() ; i++) {
			System.out.println("CONTA EM 'BUSCAR TODAS AS CONTAS': " + fachadaConta.buscarTodos().get(i).getTitular());
		}
		
		System.out.println("------------------------------------------------------------");

		//Neste processo está sendo buscado uma conta específica
		System.out.println("CONTA ESPECÍFICA: " + fachadaConta.buscarConta("12").getTitular());
		System.out.println("CONTA ESPECÍFICA: " + fachadaConta.buscarConta("15"));
		
		System.out.println("------------------------------------------------------------");

		fachadaConta.removerConta("16"); //irá remover Rayane
		
		conta4.setTitular("Maria");
		fachadaConta.alterarConta(conta4); //Lourença passa a se chamar: Maria
		
		//imprimir todas as contas novamente (para perceber as alterações
		for (int i = 0 ; i < fachadaConta.buscarTodos().size() ; i++) {
			System.out.println("CONTA EM 'BUSCAR TODAS AS CONTAS': " + fachadaConta.buscarTodos().get(i).getTitular());
		}

	}

}
