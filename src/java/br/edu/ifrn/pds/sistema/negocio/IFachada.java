package br.edu.ifrn.pds.sistema.negocio;

import java.util.ArrayList;

import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;

public interface IFachada {
	public void inserirConta(Conta conta);
	public void alterarConta(Conta conta);
	public void removerConta(String numero);
	public Conta buscarConta(String numero);
	public ArrayList<Conta> buscarTodos();
}
