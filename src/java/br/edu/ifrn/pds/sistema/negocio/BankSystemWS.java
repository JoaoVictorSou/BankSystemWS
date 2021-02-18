/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.pds.sistema.negocio;

import br.edu.ifrn.pds.sistema.negocio.dominio.Conta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eletr
 */
@WebService(serviceName = "BankSystemWS")
public class BankSystemWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    private ControladorConta controlador = new ControladorConta();
	
    @WebMethod(operationName = "inserirConta")
    public boolean inserirConta(@WebParam(name = "titular") String titular, @WebParam(name = "saldo") double saldo, @WebParam(name = "agencia") int agencia, @WebParam(name = "numero") String numero) {
        this.controlador.inserirConta(new Conta(titular, saldo, agencia, numero));
        return true;
    }
    
    @WebMethod(operationName = "alterarConta")
    public void alterarConta(@WebParam(name = "titular") String titular, @WebParam(name = "saldo") double saldo, @WebParam(name = "agencia") int agencia, @WebParam(name = "numero") String numero) {
	this.controlador.alterarConta(new Conta(titular, saldo, agencia, numero));
    }
    
    @WebMethod(operationName = "removerConta")
    public void removerConta(@WebParam(name = "numero") String numero) {
	this.controlador.removerConta(numero);
    }
    
    @WebMethod(operationName = "buscarConta")
    public Conta buscarConta(@WebParam(name = "numero") String numero) {
	return this.controlador.buscarConta(numero);
    }
    
    @WebMethod(operationName = "buscarTodos")
    public ArrayList<Conta> buscarTodos() {
	return this.controlador.buscarTodos();
    }
}
