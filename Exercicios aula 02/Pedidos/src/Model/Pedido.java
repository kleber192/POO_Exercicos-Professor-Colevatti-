package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int numeroNota;
	private double totalNota; 
	
	Produto p = new Produto();
	private List <ItemPedido> lista = new ArrayList<>();
	
public Pedido() {
	
	
	this.numeroNota = numeroNota;
	this.totalNota = totalNota;
	
	
}


public int getNumeroNota() {
		
	return numeroNota;
}


public void setNumeroNota(int numeroNota) {
	
	
	this.numeroNota = numeroNota;
	
}


public double getTotalNota() {
	
	
	ItemPedido p = new ItemPedido();
	Produto pr = new Produto();
	
	for (ItemPedido item : lista) {
		
		totalNota = p.getQuantidade() * pr.getValor() ;
	}
	 
	
	return totalNota;
}


public void adicionaItem(ItemPedido item) {
	
   item = new ItemPedido();
   	 
	   lista.add(item);
	
}





}
