
public class Gerente extends Funcionario{ // Gerente herda da classe funcionario

	private int senha = 0; // senha exclusivo da classe Gerente
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); // utiliza a palavra super para deixa claro que vem da mãe
	}
	
}
