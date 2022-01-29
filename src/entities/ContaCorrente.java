package entities;

public class ContaCorrente extends Conta{
	
	public ContaCorrente (Cliente cliente) {
		super(cliente);
	}

	@Override
	public void demonstraExtrato() {
		System.out.println(" Extrato Conta Corrente" );
		super.informa();
		
	}
}
