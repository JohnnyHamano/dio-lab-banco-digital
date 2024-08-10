package Banco.Conta;

public interface Operacoes
{
	void sacar(int valor);
	void depositar(double valor);
	void transferir(double valor, Conta destino);
	void extrato();
}