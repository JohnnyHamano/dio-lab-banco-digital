package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.Conta.Conta;

public class Banco
{
	private static Banco instance;

	private final String NOME = "Banco Digital S.A.";
	private final int AGENCIA = 1;
	private List<Conta> contas = new ArrayList<>();

	/** Cria uma instância única caso ainda não exista uma.
	**/
    public static Banco banco()
	{
        if (instance == null)
		{
			instance = new Banco();
		}

        return instance;
    }

	public String getNome()
	{
		return this.NOME;
	}

	public String getAgencia()
	{
		return String.format("%04d", this.AGENCIA);
	}

	public List<Conta> getContas()
	{
		return contas;
	}

	public void setContas(Conta conta)
	{
		this.contas.add(conta);
	}

	/** Exibe todas as contas cadastradas no banco.
	**/
	public void exibirContas()
	{
		for (Conta conta : getContas())
		{
			System.out.println(conta);
		}
	}
}