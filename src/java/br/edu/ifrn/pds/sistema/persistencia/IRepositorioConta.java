package br.edu.ifrn.pds.sistema.persistencia;
import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;
import java.util.ArrayList;

public interface IRepositorioConta {
	public void inserirConta(Conta conta);
	public void alterarConta(Conta conta);
	public void removerConta(String numero);
	public Conta buscarConta(String numero);
	public boolean verificarExistencia(String numero);
	public ArrayList<Conta> buscarTodos();
}
