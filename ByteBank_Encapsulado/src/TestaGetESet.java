
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero(1337); não é possível, pois está como private
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo; não é ppossível pois está como private
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// alterando a profissão em 2 passos
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		// 	mesmo registro no banco
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
