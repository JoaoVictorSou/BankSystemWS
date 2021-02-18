package br.edu.ifrn.pds.sistema.negocio;

import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;
import br.edu.ifrn.pds.sistema.persistencia.IRepositorioConta;
import br.edu.ifrn.pds.sistema.persistencia.RepositorioConta;
import java.util.ArrayList;

public class ControladorConta {

	private IRepositorioConta repConta;

	public ControladorConta() {
		this.repConta = new RepositorioConta();
	}
	
	public void inserirConta(Conta conta) {
		repConta.inserirConta(conta);
	}
	
	public void alterarConta(Conta conta) {
		repConta.alterarConta(conta);
	}
	
	public void removerConta(String numero) {
		repConta.removerConta(numero);
	}
	
	public Conta buscarConta(String numero) {
		return repConta.buscarConta(numero);
	}
	
	public ArrayList<Conta> buscarTodos() {
		return repConta.buscarTodos();
	}
}
