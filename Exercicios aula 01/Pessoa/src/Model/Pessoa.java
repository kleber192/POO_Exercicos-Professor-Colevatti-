package Model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Pessoa {

	
	String nome ;
	LocalDate data ;
	String profissao;
	
	
public Pessoa( ) {
	
	     
	
	
	       this.nome = nome ;
	       this.data = data ;
	       this.profissao = profissao ;   
	      
	      
}	
	
	public String getNome () { 
		
		return nome; 
		
	
	}
	
	public void setNome(String nome) {
		
		this.nome= nome;
		
	}
	
	public LocalDate getData() {
		
		return data ; 
		
	}
	
	public void setLocalDate(LocalDate data ) {
		
		
		this.data = data ; 
	
	}
	
	
   public void setLocalDate(String sdata , DateTimeFormatter formater ) {
		
		
		LocalDate data = LocalDate.parse(sdata, formater);
		setLocalDate(data);
	
	}
	
   
	public String getProfissao() {
		
		return profissao ; 
		
	}
	
	public void setProfissao(String profissao) {
		
		this.profissao = profissao ;
		
	
	}
	
	
	public int calcularData( ) {
		
		LocalDate hoje = LocalDate.now();
		
		Period periodo = Period.between(this.data, hoje) ;
		
		return periodo.getYears() ; 
		
		
	}
	
   
	public boolean temIdadeMaior() {
		
		return calcularData() > 150 ; 		
	}
	
   public String ToString() {
	   
	   
	   return " Nome : "+ nome + " Data de nascimento : "+data+" Profissão : "+profissao;
	   
	   
   }	
}
