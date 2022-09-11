
public class TestaValores {
	
	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		
		// apresenta inconsistência, pois tanto o número são criado com 0
		//conta.setAgencia(-50);
		// conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 216549);
		
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());
	}

}
