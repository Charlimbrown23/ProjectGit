package mercado;

import java.util.Scanner;

public class FormaDePagamento {
	
	private String tipo;
	private String descricao;
	
	public void realizarPagamento(double valor) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("De qual forma deseja realizar o pagamento? Digite apenas B para boleto, C para cartao de credito e D para dinheiro.");
		tipo = teclado.nextLine();
		
		if(tipo == "b") {
			boleto(valor);
		}
		else if(tipo == "c") {
			cartaoDeCredito(valor);
		}
		else {
			dinheiro(valor);
		}
	}
	
	public void cartaoDeCredito(double valor) {
		System.out.println("Você pagou com cartão de crédito.");
	}
	
	public void boleto(double valor) {
		System.out.println("Você pagou com boleto.");
	}
	
	public void dinheiro(double valor) {
		System.out.println("Você pagou com dinheiro.");
	}
}
