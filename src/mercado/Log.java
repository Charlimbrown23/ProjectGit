package mercado;
<<<<<<< HEAD
=======

>>>>>>> 690ac6be36f3304a366ee5425522fa32f13a3bf4

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

<<<<<<< HEAD
public class Log {
	
=======
public class Log extends ItensDePedido {

	public Log(long codigo, String descricao, int quantidade, double valor) {
		super(codigo, descricao, quantidade, valor);
		// TODO Auto-generated constructor stub
	}

>>>>>>> 690ac6be36f3304a366ee5425522fa32f13a3bf4
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
<<<<<<< HEAD
=======
	
	public void registrarLog(ItensDePedido itens) {
		 
		
		
	}
	
	
	
	
	
}
>>>>>>> 690ac6be36f3304a366ee5425522fa32f13a3bf4

	public void registrarLog(ItensDePedido itens) { 
		this.itens.add(0, itens);
	}
}