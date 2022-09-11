
public class TestaCondicional {
	
	public static void main(String[] args) {
//		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos, seja bem vindo");
			
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você é menor de idade, porem está " 
			+ "acompanhado, pode entrar");	
			} else {
			System.out.println("você não pode entrar");
			}	
		}
	}
}
