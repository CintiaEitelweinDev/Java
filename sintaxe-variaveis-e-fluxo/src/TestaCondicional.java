
public class TestaCondicional {
	
	public static void main(String[] args) {
//		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("Voc? tem mais de 18 anos, seja bem vindo");
			
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc? ? menor de idade, porem est? " 
			+ "acompanhado, pode entrar");	
			} else {
			System.out.println("voc? n?o pode entrar");
			}	
		}
	}
}
