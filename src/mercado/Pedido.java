package mercado;

import java.util.ArrayList;
import java.util.Date;

public class Pedido extends ItensDePedido{

	public Pedido(long codigo, String descricao, int quantidade, double valor) {
		super(codigo, descricao, quantidade, valor);
		// TODO Auto-generated constructor stub
	}

	private long numero;
	private Date data;
	private double valorTotal;
	private ArrayList<ItensDePedido> itens;
	private FormaDePagamento pagamento;
	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ArrayList<ItensDePedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItensDePedido> itens) {
		this.itens = itens;
	}

	public FormaDePagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaDePagamento pagamento) {
		this.pagamento = pagamento;
	}

	public boolean calcularTotal() {
		
		valorTotal = calcularSubTotal();
		
		
		return true;
	}
	
	public String finalizarPedido() {
		
		return "Compra Realizada!";
	}

}
