package br.com.cliente;

import br.com.banco.BancoWebService;
import br.com.banco.BancoWebServiceImplService;
import br.com.banco.Conta;
import br.com.banco.Transacao;
import br.com.banco.TransacaoArray;

public class Banco {
	
	public static boolean criaConta( int nConta, double valor ) {
		
		try {
			BancoWebServiceImplService bwsService = new BancoWebServiceImplService();
			BancoWebService bws = bwsService.getBancoWebServiceImplPort();
			
			bws.criaNovaConta( nConta, valor );
			
			return true; 
		} catch( Exception e ) {
			
			return false;
		}
	}

	public static boolean deposito( int nConta, double valor ) {
		
		try {
			BancoWebServiceImplService bwsService = new BancoWebServiceImplService();
			BancoWebService bws = bwsService.getBancoWebServiceImplPort();
			
			return bws.deposito( nConta, valor );
		} catch( Exception e ) {
			
			return false;
		}
	}
	
	public static boolean saque( int nConta, double valor ) {
		
		try {
			BancoWebServiceImplService bwsService = new BancoWebServiceImplService();
			BancoWebService bws = bwsService.getBancoWebServiceImplPort();
			
			return bws.saque( nConta, valor );
		} catch( Exception e ) {
			
			return false;
		}
	}
	
	public static Conta saldo( int nConta ) {
		
		try {
			BancoWebServiceImplService bwsService = new BancoWebServiceImplService();
			BancoWebService bws = bwsService.getBancoWebServiceImplPort();
			
			return bws.saldo( nConta );
		} catch( Exception e ) {
			
			return new Conta();
		}
	}

	public static TransacaoArray Extrato( int nConta ) {
		
		try {
			BancoWebServiceImplService bwsService = new BancoWebServiceImplService();
			BancoWebService bws = bwsService.getBancoWebServiceImplPort();
			System.out.println( "Ban - " + nConta );
			return bws.extrato( nConta );
		} catch( Exception e ) {
			
			return null;
		}
	}
}
