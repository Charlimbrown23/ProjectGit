package test;


import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

public class Log extends ItensDePedido {

	private Date data;
	private Timer hora;
	private ArrayList<ItensDePedido> itens;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Timer getHora() {
		return hora;
	}
	public void setHora(Timer hora) {
		this.hora = hora;
	}
	public ArrayList<ItensDePedido> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItensDePedido> itens) {
		this.itens = itens;
	}
	
	public void registrarLog(ItensDePedido itens) {
		 
		itens= this.itens.getProduto();
		
	}
	
	
	
	
	
}
