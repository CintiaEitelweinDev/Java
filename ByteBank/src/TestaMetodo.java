
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50); //chamanda (invocação) do método
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
//		contaDaMarcela.transfere(300, contaDoPaulo);
//		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
		boolean sucessoTranferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if(sucessoTranferencia) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
