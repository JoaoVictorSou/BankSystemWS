package br.edu.ifrn.pds.sistema.persistencia;

import java.util.ArrayList;

import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;

public class RepositorioConta implements IRepositorioConta {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void inserirConta(Conta conta) {
		if (!this.verificarExistencia(conta.getNumero())) {
			this.contas.add(conta);
		}
	}

	public void alterarConta(Conta conta) {
		String numero = conta.getNumero();
		if (contas.size() == 0) {
			//pois não existe nenhuma conta no banco estara sem nenhuma conta, nao ha conta a se remover
		} 
		else if (this.verificarExistencia(numero)) {
			for (int i = 0 ; i < contas.size() ; i++) {
				if (numero.equals(contas.get(i).getNumero())) {
					contas.set(i, conta);
				}
			}
		}
	}

	public void removerConta(String numero) {
		if (contas.size() == 0) {
			//pois não existe nenhuma conta no banco estara sem nenhuma conta, nao ha conta a se remover
		} 
		else if (this.verificarExistencia(numero)) {
			for (int i = 0 ; i < contas.size() ; i++) {
				if (numero.equals(contas.get(i).getNumero())) {
					contas.remove(i);
				}
			}
		}
	}

	@Override
	public Conta buscarConta(String numero) {
		if (contas.size() == 0) {
			//pois não existe nenhuma conta no banco estara sem nenhuma conta, nao ha conta a se procurar
		} 
		else if (verificarExistencia(numero)) {
			for (int i = 0 ; i < contas.size() ; i++) {
				if (numero.equals(contas.get(i).getNumero())) {
					return contas.get(i);
				}
			}
		}
		
		return null;
	}

	public boolean verificarExistencia(String numero) {
		boolean existencia = false;
		
		if (contas.size() == 0) {
		//pois não existe nenhuma conta no banco estara sem nenhuma conta, neste caso de existencia, qualquer numero de conta poderá ser criado.
		} else {
			for (int i = 0 ; i < contas.size() ; i++) {
				if (numero.equals(contas.get(i).getNumero())) {
					existencia = true;
					break;
				}
			}
		}
		return existencia;
	}

	public ArrayList<Conta> buscarTodos() {
		return contas;
	}
	
}
