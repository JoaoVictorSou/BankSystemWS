package br.edu.ifrn.pds.sistema.negocio.dominio;

public class Conta {
	private String titular;
	private double saldo;
	private int agencia; 
	private String numero;
	
	public Conta() {
		
	}
	public Conta(String titular, double saldo, int agencia, String numero) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
