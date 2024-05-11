package view;

import java.util.Scanner;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Principal {

	
	
	
	public static void main(String args [] ) {
			
	Scanner scan = new Scanner(System.in);
	Passeio passeio = new Passeio();
	Carga carga = new Carga();
	Motor m = new Motor();
	
	          System.out.println(" Veiculo 1 : ");
	System.out.println(" ===========================================");
	
		System.out.println(" Digite a marca  do veiculo : ");
		passeio.setMarca(scan.nextLine());
		
		System.out.println(" Digite o modelo do veiculo : ");
		passeio.setModelo(scan.nextLine());
		
		System.out.println(" Digite a cor : ");
		passeio.setCor(scan.nextLine());
		
		System.out.println(" Digite a potencia do motor  : ");
		m.setPotencia(Integer.parseInt(scan.nextLine()));
		
		System.out.println(" Digite a qtd de pistao  do motor  : ");
		m.setQtdPistao(Integer.parseInt(scan.nextLine()));
		
		System.out.println(" Digite a Qtd de Passageiros  : ");
		passeio.setQtdPassageiros(Integer.parseInt(scan.nextLine()));
		
		System.out.println(" Digite a quantidade de rodas : ");
		passeio.setRodas(Integer.parseInt(scan.nextLine()));
		
		
		System.out.println(" Digite a velocidade maxima : ");
		passeio.setVelMaxima(Integer.parseInt(scan.nextLine()));
		
		
		System.out.println(carga);
		
		System.out.println(" velocidade maxima e : "+passeio.valcVelocidade(80));
		
		
		System.out.println(" ===========================================");
		System.out.println(" ===========================================");
		System.out.println(" ===========================================");
		System.out.println(" ===========================================");
		
		
		    System.out.println(" Veiculo 2 : ");
       System.out.println(" ===========================================");
			
				System.out.println(" Digite a marca  do veiculo : ");
				carga.setMarca(scan.nextLine());
				
				System.out.println(" Digite o modelo do veiculo : ");
				carga.setModelo(scan.nextLine());
				
				System.out.println(" Digite a cor : ");
				carga.setCor(scan.nextLine());
				
				System.out.println(" Digite a potencia do motor  : ");
				m.setPotencia(Integer.parseInt(scan.nextLine()));
				
				System.out.println(" Digite a qtd de pistao  do motor  : ");
				m.setQtdPistao(Integer.parseInt(scan.nextLine()));
				
				System.out.println(" Digite a carga Maxima   : ");
				carga.setCargMaxima(Integer.parseInt(scan.nextLine()));
				
				System.out.println(" Digite a taxa  : ");
				carga.setTaxa(Integer.parseInt(scan.nextLine()));
				
				System.out.println(" Digite a quantidade de rodas : ");
				carga.setRodas(Integer.parseInt(scan.nextLine()));
				
				System.out.println(" Digite a velocidade maxima : ");
				carga.setVelMaxima(Integer.parseInt(scan.nextLine()));
				

				System.out.println(carga);
				
				System.out.println(" velocidade maxima e : "+passeio.valcVelocidade(80));
	
	}
	
}
