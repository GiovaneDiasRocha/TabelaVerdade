package TabVerdade;

public class MetodosTabelaVerdade {
	
	String matrizPQ[][] = {{"V","V"},{"V","F"},{"F","V"},{"F","F"}};
    String matrizPQR[][] = {{"V","V","V"},{"V","V","F"},{"V","F","V"},{"V","F","F"},{"F","V","V"},{"F","V","F"},{"F","F","V"},{"F","F","F"}};
    String negPemPQ[] = new String [4];
    String negQemPQ[] = new String [4];
    String conjPeQ[] = new String [4];
    String disjuPeQ[] = new String [4];
    String condPeQ[] = new String [4];
    String negPemPQR[] = new String [8];
    String negQemPQR[] = new String [8];
    String negRemPQR[] = new String [8];
    String conjPeQemPQR[] = new String [8];
    String conjPeRemPQR[] = new String [8];
    String conjQeRemPQR[] = new String [8];
    String disjuPeQemPQR[] = new String [8];
    String disjuPeRemPQR[] = new String [8];
    String disjuQeRemPQR[] = new String [8];
    String condPeQemPQR[] = new String [8];
    String condPeRemPQR[] = new String [8];
    String condQeRemPQR[] = new String [8];
	
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
             
                if(matrizPQ[i][0]=="V") {
                    negPemPQ[j++]= "F";
                } else {
                	negPemPQ[j++]= "V";
                }
            
        }
        System.out.println();
        for(int i=0; i<4; i++) {
        	System.out.print(negPemPQ[i]);
        	System.out.println();
        }   

    }

    public void negacaoQemPQ() {

    	int j=0;
        for(int i=0; i<4; i++) {
             
                if(matrizPQ[i][1]=="V") {
                    negQemPQ[j++]= "F";
                } else {
                	negQemPQ[j++]= "V";
                }
            
        }
        System.out.println();
        for(int i=0; i<4; i++) {
        	System.out.print(negQemPQ[i]);
        	System.out.println();
        }      

    }

    public void negacaoPemPQR() {
    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][0]=="V") {
                    negPemPQR[j++]= "F";
                } else {
                	negPemPQR[j++]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(negPemPQR[i]);
                System.out.println();          
        }
    }
    
    public void negacaoQemPQR() {

    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][1]=="V") {
                    negQemPQR[j++]= "F";
                } else {
                	negQemPQR[j++]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(negQemPQR[i]);
                System.out.println();          
        }
    }

    public void negacaoRemPQR() {

    	int j=0;
        for(int i=0; i<8; i++) {       
            
                if(matrizPQR[i][2]=="V") {
                    negRemPQR[j++]= "F";
                } else {
                	negRemPQR[j++]= "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {          
                System.out.print(negRemPQR[i]);
                System.out.println();          
        }
    }

    public void conjuncaoPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(matrizPQ[i][0] == "V" && matrizPQ[i][1] == "V") {
                conjPeQ[j++] = "V"; 
            } else {
                conjPeQ[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(conjPeQ[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(matrizPQ[i][0] == "V" || matrizPQ[i][1] == "V") {
                conjPeQ[j++] = "V"; 
            } else {
                conjPeQ[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(conjPeQ[i]);
            System.out.println();
        }  
    }

    public void condicionalPQ() {
        int j =0;
        for(int i=0; i<4; i++) {      
            if(matrizPQ[i][0] == "V" && matrizPQ[i][1] != "V") {
                condPeQ[j++] = "F"; 
            } else {
                condPeQ[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<4; i++) {           
                System.out.print(condPeQ[i]);
            System.out.println();
        }  
    }

    public void conjuncaoPQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" && matrizPQR[i][1] == "V") {
                conjPeQemPQR[j++] = "V"; 
            } else {
                conjPeQemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(conjPeQemPQR[i]);
            System.out.println();
        }  
    }

    public void conjuncaoPRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" && matrizPQR[i][2] == "V") {
                conjPeQemPQR[j++] = "V"; 
            } else {
                conjPeQemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(conjPeQemPQR[i]);
            System.out.println();
        }  
    }

    public void conjuncaoQRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][1] == "V" && matrizPQR[i][2] == "V") {
                conjPeQemPQR[j++] = "V"; 
            } else {
                conjPeQemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(conjPeQemPQR[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" || matrizPQR[i][1] == "V") {
                disjuPeQemPQR[j++] = "V"; 
            } else {
                disjuPeQemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(disjuPeQemPQR[i]);
            System.out.println();
        }  
    }

    public void disjuncaoPRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" || matrizPQR[i][2] == "V") {
                disjuPeRemPQR[j++] = "V"; 
            } else {
                disjuPeRemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(disjuPeRemPQR[i]);
            System.out.println();
        }  
    }

    public void disjuncaoQRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][1] == "V" || matrizPQR[i][2] == "V") {
                disjuQeRemPQR[j++] = "V"; 
            } else {
                disjuQeRemPQR[j++] = "F";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(disjuQeRemPQR[i]);
            System.out.println();
        }  
    }

    public void condicionalPeQemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" && matrizPQR[i][1] == "F") {
                condPeQemPQR[j++] = "F"; 
            } else {
                condPeQemPQR[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(condPeQemPQR[i]);
            System.out.println();
        }  
    }

    public void condicionalPeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][0] == "V" && matrizPQR[i][2] == "F") {
                condPeRemPQR[j++] = "F"; 
            } else {
                condPeRemPQR[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(condPeRemPQR[i]);
            System.out.println();
        }  
    }

    public void condicionalQeRemPQR() {
        int j =0;
        for(int i=0; i<8; i++) {      
            if(matrizPQR[i][1] == "V" && matrizPQR[i][2] == "F") {
                condPeRemPQR[j++] = "F"; 
            } else {
                condPeRemPQR[j++] = "V";
            }
        }
        System.out.println();
        for(int i=0; i<8; i++) {           
                System.out.print(condQeRemPQR[i]);
            System.out.println();
        }  
    }
}
