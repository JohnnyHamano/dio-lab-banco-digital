package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.Conta.Conta;

public class Cliente
{
	private String nome;
	private String cpf;
	private List<Conta> contas = new ArrayList<>();

	public Cliente(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome()
	{
		return this.nome;
	}

	public String getCPF()
	{
		return this.cpf;
	}

	public void setContas(Conta conta)
	{
		this.contas.add(conta);
	}

	public List<Conta> getContas()
	{
		return this.contas;
	}
}