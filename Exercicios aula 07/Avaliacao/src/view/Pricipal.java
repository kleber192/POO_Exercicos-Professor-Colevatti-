package view;

import java.util.Scanner;

import Control.ControlAtividade;
import Control.ControleProva;
import Model.Atividades;
import Model.Prova;

public class Pricipal {

	public static void main(String[] args) {
		
		
	ControleProva p = new ControleProva();
	Prova pp = new Prova();
	
	
	ControlAtividade aa = new ControlAtividade();
	Atividades at = new Atividades();
	
	Scanner scan = new Scanner(System.in);
	int posicao ;
	
	System.out.println("Sistema Prova ");
	
	System.out.println("Digite a questao da Prova ");
	pp.setQuestoes(Integer.parseInt(scan.nextLine()));
	
	
	System.out.println("Digite a media  da Prova ");
	pp.setMediaNotas(Double.parseDouble(scan.nextLine()));
	
	
	p.adicionarProva(pp);
	
	System.out.println("Digite a posiao da prova a ser analizada ");
    posicao = Integer.parseInt(scan.nextLine());
    
    
	
    try {
    	
    	System.out.println("Resultado da pesquisa "+p.consultarProva(posicao));
    	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	System.out.println("Digite a posiao da prova a ser excluida ");
	posicao = Integer.parseInt(scan.nextLine());
	
	p.excluirProva(posicao);
	
	  try {
	    	
	    	System.out.println("Resultado da pesquisa "+p.consultarProva(posicao));
	    	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	System.out.println("================================================ ");
	System.out.println("================================================ ");
	
	System.out.println("================================================ ");
	
      System.out.println("Sistema Atividades ");
	
	System.out.println("Digite o Titulo da atividade  ");
	at.setAssunto(scan.nextLine());
	
	
	System.out.println("Digite o numero de paginas");
	at.setPaginas(Integer.parseInt(scan.nextLine()));
	
	
	aa.adicionarProva(at);
	
	System.out.println("Digite a posiao da prova a ser analizada ");
    posicao = Integer.parseInt(scan.nextLine());
    
    try {
    	System.out.println("Resultado da pesquisa "+aa.consultarProva(posicao));
	} catch (Exception e) {
		
		e.printStackTrace();
	}
    
	
	System.out.println("Digite a posiao da Atividade a ser excluida ");
	posicao = Integer.parseInt(scan.nextLine());
	
	aa.excluirProva(posicao);
	
	
	
	 try {
	    	System.out.println("Resultado da pesquisa "+aa.consultarProva(posicao));
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
