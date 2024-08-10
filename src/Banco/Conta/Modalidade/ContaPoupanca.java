package Banco.Conta.Modalidade;

import Banco.Cliente;
import Banco.Conta.Conta;

public class ContaPoupanca extends Conta
{
	public ContaPoupanca(Cliente cliente)
	{
		super(cliente);
	}
	
	/** Exibe o extrato da conta, com todas as informações.
	**/
	public void extrato() {
		System.out.println("\n=== Extrato Conta Poupança ===");

		super.getInfo();
	}
}