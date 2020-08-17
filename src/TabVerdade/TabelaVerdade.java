package TabVerdade;
import java.util.Scanner;

public class TabelaVerdade {
	
	
    
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int escolha = 1;
		int opcao = 0;
		int pref = 0;
		
		MetodosTabelaVerdade obj = new MetodosTabelaVerdade();
		
		while(escolha  != 3) {
			System.out.println("Escolha o número da tabela com qual deseja trabalhar: ");
			System.out.println("1 - Tabela PQ");
			System.out.println("2 - Tabela PQR");
			System.out.println("3 - Fechar Programa");		
			escolha = leia.nextInt(); leia.nextLine();
			
			if (escolha == 1) {
				while(opcao != 7) {
					System.out.println("1 -  Exibir tabela PQ");
					System.out.println("2 -  Negação de P na tapela PQ");
					System.out.println("3 -  Negação de Q na tapela PQ");
					System.out.println("4 -  Conjunção PQ");
		            System.out.println("5 -  Disjunção PQ");
		            System.out.println("6 -  Condicional PQ");
		            System.out.println("Sair");
		            
		            opcao = leia.nextInt(); leia.nextLine();
		            
		            
		            switch (opcao) {
					case 1:
						obj.lerMatrizPQ();
						break;

					case 2:
						obj.negacaoPemPQ();
						break;
						
					case 3:
						obj.negacaoQemPQ();
						break;
						
					case 4:
						obj.conjuncaoPQ();
						break;
						
					case 5:
						obj.disjuncaoPQ();
						break;
						
					case 6:
						obj.condicionalPQ();
						break;
					}
				}
					
			} else if(escolha == 2) {
				while(pref != 14) {
					System.out.println("1  - Exibir tabela PQR");
					System.out.println("2  - Negação de P na tapela PQR");
		            System.out.println("3  - Negação de Q na tapela PQR");
		            System.out.println("4  - Negação de R na tapela PQR");
		            System.out.println("5  - Conjunção P e Q na tapela PQR");
		            System.out.println("6  - Conjunção P e R na tapela PQR");
		            System.out.println("7  - Conjunção Q e R na tapela PQR");
		            System.out.println("8  - Disjunção P e Q na tapela PQR");
		            System.out.println("9  - Disjunção P e R na tapela PQR");
		            System.out.println("10 - Disjunção Q e R na tapela PQR");
		            System.out.println("11 - Condicional P e Q na tapela PQR");
		            System.out.println("12 - Condicional P e R na tapela PQR");
		            System.out.println("13 - Condicional Q e R na tapela PQR");
		            System.out.println("Sair");
		            
		            pref = leia.nextInt(); leia.nextLine();
		            
		            switch (pref) {
					case 1:
						obj.lerMatrizPQR();
						break;

					case 2:
						obj.negacaoPemPQR();
						break;
						
					case 3:
						obj.negacaoQemPQR();
						break;
	
					case 4:
						obj.negacaoRemPQR();
						break;
	
					case 5:
						obj.conjuncaoPQemPQR();
						break;
	
					case 6:
						obj.conjuncaoPRemPQR();
						break;
	
					case 7:
						obj.conjuncaoQRemPQR();
						break;
	
					case 8:
						obj.disjuncaoPQemPQR();
						break;
	
					case 9:
						obj.disjuncaoPRemPQR();
						break;
	
					case 10:
						obj.disjuncaoQRemPQR();
						break;
	
					case 11:
						obj.condicionalPeQemPQR();
						break;
	
					case 12:
						obj.condicionalPeRemPQR();
						break;
	
					case 13:
						obj.condicionalQeRemPQR();
						break;
	
					}
		            
				}			
			}
		
		}
		leia.close();
	}
}