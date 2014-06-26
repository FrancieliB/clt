package br.com.cliente;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class IndexView {
	
	String numeroConta;
	String valor;
	 
    public void deposito(ActionEvent actionEvent) {
    	
    	int n = Integer.valueOf( numeroConta );
    	double v = Double.valueOf( valor );
    	
    	if(Banco.deposito( n, v )){
    		addMessage( "Depositado" );
    	}else{
    		addMessage( "Erro =/" );
    	}
    }
    
    public void saque(ActionEvent actionEvent) {
    	
    	int n = Integer.valueOf( numeroConta );
    	double v = Double.valueOf( valor );
    	
    	if(Banco.deposito( n, v )){
    		addMessage( "Sacado" );
    	}else{
    		addMessage( "Erro =/" );
    	}
    }
    
    public void criaConta( int nConta, double valor ) {
    	
    	if(Banco.criaConta( nConta, valor )){
    		addMessage( "Criado" );
    	}else{
    		addMessage( "Erro =(" );
    	}
    }
    
    public void saldo(ActionEvent actionEvent) {
    	addMessage( "Saldo: " + Banco.saldo( Integer.valueOf( numeroConta ) ).getSaldo() );
    }
    
    public void criaContas(ActionEvent actionEvent) {
    	criaConta(2205, 300D);
		criaConta(2206, 300D);
		criaConta(2207, 0D);
		System.out.println( "Criados... " );
    }
     
    public void addMessage(String summary) {
    	
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta( String numeroConta ) {
		this.numeroConta = numeroConta;
	}

	public String getValor() {
		return valor;
	}
	
	public void setValor( String valor ) {
		this.valor = valor;
	}
}