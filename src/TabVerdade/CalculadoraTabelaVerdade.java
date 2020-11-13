package TabVerdade;

import java.util.Scanner;

public class CalculadoraTabelaVerdade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String calc[] = new String[4];
		String tela;
		MetodosTabelaVerdade obj = new MetodosTabelaVerdade();
		MetodosTabelaVerdadeTeste objTeste = new MetodosTabelaVerdadeTeste();
		
		System.out.println();
		tela = leia.nextLine();
		objTeste.atribuiMemoria(tela);
		//calc = tela.split(" ");
		
		
		/*
		obj.testaNegativo(tela);
		
		
		if(calc[0].equals("q") && calc[1].equals("->") && calc[2].equals("q")) {
			obj.condicionalQP();
		}
		
		for(int j=0; j<calc.length; j++) {
			
			if((calc[j].equals("p") && calc[j+2].equals("q"))
					||(calc[j].equals("p") && calc[j+2].equals("~q"))
					||(calc[j].equals("~p") && calc[j+2].equals("q"))
					||(calc[j].equals("~p") && calc[j+2].equals("~q"))) { 
				
				if(calc[j+1].equals("+")) {
					obj.disjuncaoPQ();
					
				} else if(calc[j+1].equals("*")) {
					obj.conjuncaoPQ();
					
				} else if(calc[j+1].equals("->")) {
					obj.condicionalPQ();
					
				} else if(calc[j+1].equals("<->")) {
					obj.biCondicionalPQ();
				}
				
			}
			
		}
		*/			
		
		
		leia.close();
	}
	
	
}
