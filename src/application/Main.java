package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("José");
		
		Conta cc = new ContaCorrente (cliente1);
		Conta pp = new ContaPoupanca (cliente1);
		
		cc.depositar(100);
		cc.transferir(100, pp);
		
		cc.demonstraExtrato();
		pp.demonstraExtrato();

	}

}
