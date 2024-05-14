package model;

public abstract class Funcionario {

	
	
	protected String nome;
	protected String id;
	protected double salario ;
	
	
	
public Funcionario() {
	
	super();
}
	


public String getNome() {
	
	return nome;
}

public void setNome(String nome) {
	
	
	this.nome = nome;
	
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public double getSalario() {
	return salario;
}



public void setSalario(double salario) {
	this.salario = salario;
 }


}

