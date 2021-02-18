package br.edu.ifrn.pds.sistema.negocio;

import java.util.ArrayList;

import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;
import br.edu.ifrn.pds.sistema.persistencia.IRepositorioConta;
import br.edu.ifrn.pds.sistema.persistencia.RepositorioConta;

public class FachadaConta implements IFachada {
	private ControladorConta controlador = new ControladorConta();
	
	public void inserirConta(Conta conta) {
		this.controlador.inserirConta(conta);
	}
	
	public void alterarConta(Conta conta) {
		this.controlador.alterarConta(conta);
	}
	
	public void removerConta(String numero) {
		this.controlador.removerConta(numero);
	}
	
	public Conta buscarConta(String numero) {
		return this.controlador.buscarConta(numero);
	}
	
	public ArrayList<Conta> buscarTodos() {
		return this.controlador.buscarTodos();
	}
}
