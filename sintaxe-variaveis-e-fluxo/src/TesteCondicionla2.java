
public class TesteCondicionla2 {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");			
		} else {
			System.out.println("você não pode entrar");
		}	
	}
}
