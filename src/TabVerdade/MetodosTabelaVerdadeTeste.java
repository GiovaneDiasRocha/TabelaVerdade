package TabVerdade;

public class MetodosTabelaVerdadeTeste {
	
	String[][] matrizPQ = {{"V","V"},{"V","F"},{"F","V"},{"F","F"}};
	String[] vectPemPQ = {"V","V","F","F"};
	String[] vectQemPQ = {"V","F","V","F"};
    String[][] matrizPQR = {{"V","V","V"},{"V","V","F"},{"V","F","V"},{"V","F","F"},{"F","V","V"},{"F","V","F"},{"F","F","V"},{"F","F","F"}};
    String[] memoria4 = new String[4];
    String[] memoria4Aux = new String[4];
    String[] memoriaResult = new String[4];
    
    public void atribuiMemoria(String tela) {
    	String[] calc;
    	calc = tela.split(" ");

		for (String s : calc) {
			if (s.equals("p")) {
				memoria4 = vectPemPQ;
			} else if (s.equals("q")) {
				memoria4Aux = vectQemPQ;
			}
		}

		for (String s : calc) {
			if (s.equals("*")) {
				calculaConjuncaoPQ();
			}
		}
    }
    
	public void calculaConjuncaoPQ() {
		int j =0;
        
		for(int i=0; i<4; i++) {      
            if(memoria4[i].equals("V") && memoria4Aux[i].equals("V")) {
            	memoriaResult[j++] = "V"; 
            } else {
            	memoriaResult[j++] = "F";
            }
            
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaResult[i]);
            System.out.println();
        }
        
	}
      
	
}
