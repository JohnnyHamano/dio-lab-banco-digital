package Banco.Conta;

import Banco.Banco;
import Banco.Cliente;

public abstract class Conta implements Operacoes
{
	private static final int AGENCIA = 0001;
	private static int novo_numero_conta = 1;
	private static int novo_digito = 0;
	
	private Cliente cliente;
	private int agencia;
	private int numero;
	private int digito;
	private double saldo;
	
	public Conta(Cliente cliente) 
	{
		System.out.println(novo_digito);

		this.cliente = cliente;

		this.agencia = AGENCIA;
		this.numero = novo_numero_conta++;
		this.digito = novo_digito++ % 10;
		
		cliente.setContas(this);
		Banco.banco().setContas(this);
	}

	public Cliente getCliente()
	{
		return this.cliente;
	}

	public String getAgencia()
	{
		return String.format("%04d", this.agencia);
	}

	public String getNumero()
	{
		return String.format("%06d-%d", this.numero, this.digito);
	}

	public double getSaldo()
	{
		return this.saldo;
	}

	@Override
	public void sacar(int valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta destino) {
		this.saldo -= valor;
		destino.depositar(valor);
	}

	/** Exibe todas as informações da conta.
	**/
	protected void getInfo() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("CPF: " + this.cliente.getCPF());

		System.out.println(String.format("Agência: %04d", this.agencia));
		System.out.println(String.format("Conta número: %06d-%d", this.numero, this.digito));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
	}
}