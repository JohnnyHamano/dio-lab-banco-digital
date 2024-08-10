package Banco.Conta.Modalidade;

import Banco.Cliente;
import Banco.Conta.Conta;

public class ContaCorrente extends Conta
{
	public ContaCorrente(Cliente cliente)
	{
		super(cliente);
	}
	
	/** Exibe o extrato da conta, com todas as informações.
	**/
	public void extrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		
		super.getInfo();
	}
}