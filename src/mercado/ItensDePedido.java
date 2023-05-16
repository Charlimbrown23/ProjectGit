package test;

public class ItensDePedido extends Produto {

	private int quantidade;
	private Produto produto;
	
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public boolean incrementaQtde() {
		
		quantidade++;
		
		return true;
	}
	public boolean decrementaQtde() {
		
		quantidade--;
		return true;
	}
	public double calcularSubTotal() {
		
		 double result;
		 result = produto.getValor();
		 
		 result*=quantidade;
		
		 return result;
	}
	
	
	
	
	
	
	
}
