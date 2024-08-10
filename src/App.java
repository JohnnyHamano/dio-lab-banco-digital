import Banco.Cliente;
import Banco.Conta.Conta;
import Banco.Conta.Modalidade.*;

public class App {
	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente("John Doe", "123.456.789-10");

		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		corrente.depositar(100);
		corrente.transferir(50, poupanca);
		poupanca.sacar(10);
		
		corrente.extrato();
		poupanca.extrato();
	}
}