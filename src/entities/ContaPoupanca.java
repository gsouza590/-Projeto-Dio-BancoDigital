package entities;

public class ContaPoupanca  extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void demonstraExtrato() {
		System.out.println(" Extrato Conta Poupanca" );
		super.informa();
		
	}

	
}
