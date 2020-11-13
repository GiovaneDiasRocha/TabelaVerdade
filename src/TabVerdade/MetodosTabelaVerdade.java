package TabVerdade;

public class MetodosTabelaVerdade {
	
    String[][] matrizPQ = {{"V","V"},{"V","F"},{"F","V"},{"F","F"}};
    String[][] matrizPQR = {{"V","V","V"},{"V","V","F"},{"V","F","V"},{"V","F","F"},{"F","V","V"},{"F","V","F"},{"F","F","V"},{"F","F","F"}};
    String[][] memoria4 = matrizPQ;
    String[][] memoria8 = matrizPQR;
    public String[] memoriaAux = new String[8];
	
	public void lerMatrizPQ() {  
        for(int i=0; i<4; i++) {
            for(int j=0; j<2 ;j++) {
                System.out.print(matrizPQ[i][j] + "  ");
            }
            System.out.println();
        }  
    }
    
    public void lerMatrizPQR() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<3 ;j++) {
                System.out.print(matrizPQR[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void negacaoPemPQ() {
    	int j=0;
        for(int i=0; i<4; i++) {
             
                if(matrizPQ[i][0].equals("V")) {
                	memoria4[j++][0]= "F";
                } else {
                	memoria4[j++][0]= "V";
                }
            
        }

    }

    public void negacaoQemPQ() {

    	int j=0;
        for(int i=0; i<4; i++) {
             
                if(matrizPQ[i][1].equals("V")) {
                	memoria4[j++][1]= "F";
                } else {
                	memoria4[j++][1]= "V";
                }
            
        }
        
    }

    public void negacaoPemPQR() {
    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][0].equals("V")) {
                	memoria8[j++][0]= "F";
                } else {
                	memoria8[j++][0]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(memoria8[i][0]);
                System.out.println();          
        }
    }
    
    public void negacaoQemPQR() {

    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][1].equals("V")) {
                	memoria8[j++][1]= "F";
                } else {
                	memoria8[j++][1]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(memoria8[i][1]);
                System.out.println();          
        }
    }

    public void negacaoRemPQR() {

    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][2].equals("V")) {
                	memoria8[j++][2]= "F";
                } else {
                	memoria8[j++][2]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(memoria8[i][2]);
                System.out.println();          
        }
    }

    public void conjuncaoPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(memoria4[i][0].equals("V") && memoria4[i][1].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(memoria4[i][0].equals("V") || memoria4[i][1].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void condicionalPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(memoria4[i][0].equals("V") && memoria4[i][1].equals("F")) {
            	memoriaAux[j++] = "F"; 
            } else {
            	memoriaAux[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void condicionalQP() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(memoria4[i][1].equals("V") && memoria4[i][0].equals("F")) {
            	memoriaAux[j++] = "F"; 
            } else {
            	memoriaAux[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void biCondicionalPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(memoria4[i][0].equals(memoria4[i][1])) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void conjuncaoPQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") && memoria8[i][1].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void conjuncaoPRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") && memoria8[i][2].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void conjuncaoQRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][1].equals("V") && memoria8[i][2].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") || memoria8[i][1].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
                memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") || memoria8[i][2].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void disjuncaoQRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][1].equals("V") || memoria8[i][2].equals("V")) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void condicionalPeQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") && memoria8[i][1].equals("F")) {
            	memoriaAux[j++] = "F"; 
            } else {
            	memoriaAux[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void condicionalPeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals("V") && memoria8[i][2].equals("F")) {
            	memoriaAux[j++] = "F"; 
            } else {
            	memoriaAux[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }

    public void condicionalQeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][1].equals("V") && memoria8[i][2].equals("F")) {
                memoriaAux[j++] = "F"; 
            } else {
            	memoriaAux[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void biCondicionalPeQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals(memoria8[i][1])) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void biCondicionalPeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][0].equals(memoria8[i][2])) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void biCondicionalQeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(memoria8[i][1].equals(memoria8[i][2])) {
            	memoriaAux[j++] = "V"; 
            } else {
            	memoriaAux[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(memoriaAux[i]);
            System.out.println();
        }  
    }
    
    public void testaNegativo(String teste) {
    	String[] calc;
    	calc = teste.split(" ");

        for (String s : calc) {
            if (s.equals("~p")) {
                negacaoPemPQ();
            }
            if (s.equals("~q")) {
                negacaoQemPQ();
            }
        }
    }



}
