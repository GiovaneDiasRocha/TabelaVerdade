package TabVerdade;
import java.util.Scanner;

public class TabelaVerdade {
	
	String matrizPQ[][] = {{"V","V"},{"V","F"},{"F","V"},{"F","F"}};
    String matrizPQR[][] = {{"V","V","V"},{"V","V","F"},{"V","F","V"},{"V","F","F"},{"F","V","V"},{"F","V","F"},{"F","F","V"},{"F","F","F"}};
    String conjPeQ[] = new String [4];
    String condPeQ[] = new String [4];
    String disjuPeQ[] = new String [4];
    String conjPeQemPQR[] = new String [8];
    String conjPeRemPQR[] = new String [8];
    String conjQeRemPQR[] = new String [8];
    String disjuPeQemPQR[] = new String [8];
    String disjuPeRemPQR[] = new String [8];
    String disjuQeRemPQR[] = new String [8];
    String condPeQemPQR[] = new String [8];
    String condPeRemPQR[] = new String [8];
    String condQeRemPQR[] = new String [8];
    
    public static void main(String[] args) {
    int escolha = 0;
    Scanner leia = new Scanner(System.in);

    TabelaVerdade obj = new TabelaVerdade();
    
    while(escolha != 20) {
            System.out.println("1 -  Exibir tabela PQ");
            System.out.println("2 -  Exibir tabela PQR");
            System.out.println("3 -  Negação de P na tapela PQ");
            System.out.println("4 -  Negação de Q  na tapela PQ");
            System.out.println("5 -  Conjunção PQ");
            System.out.println("6 -  Disjunção PQ");
            System.out.println("7 -  Condicional PQ");
            System.out.println("8 -  Negação de P na tapela PQR");
            System.out.println("9 -  Negação de Q na tapela PQR");
            System.out.println("10 - Negação de R na tapela PQR");
            System.out.println("11 - Conjunção P e Q na tapela PQR");
            System.out.println("12 - Conjunção P e R na tapela PQR");
            System.out.println("13 - Conjunção Q e R na tapela PQR");
            System.out.println("14 - Disjunção P e Q na tapela PQR");
            System.out.println("15 - Disjunção P e R na tapela PQR");
            System.out.println("16 - Disjunção Q e R na tapela PQR");
            System.out.println("17 - Condicional P e Q na tapela PQR");
            System.out.println("18 - Condicional P e R na tapela PQR");
            System.out.println("19 - Condicional Q e R na tapela PQR");
            System.out.println("20 - Sair");

            escolha = leia.nextInt(); leia.nextLine();

            switch (escolha) {
                case 1:
                    obj.lerMatrizPQ();
                    break;
                case 2:
                    obj.lerMatrizPQR(); 
                    break;              
                case 3:
                    obj.negacaoPemPQ();
                    break;
                case 4:
                    obj.negacaoQemPQ();
                    break;
                case 5:
                    obj.conjuncaoPQ();
                    break;
                case 6:
                    obj.disjuncaoPQ();
                    break; 
                case 7:
                    obj.condicionalPQ();
                    break;
                case 8:
                    obj.negacaoPemPQR();
                    break;
                case 9:
                    obj.negacaoQemPQR();
                    break;
                case 10:
                    obj.negacaoRemPQR();
                    break;
                case 11:
                    obj.conjuncaoPQemPQR();
                    break;
                case 12:
                    obj.conjuncaoPRemPQR();
                    break;
                case 13:
                    obj.conjuncaoQRemPQR();
                    break;
                case 14:
                    obj.disjuncaoPQemPQR();
                    break;
                case 15:
                    obj.disjuncaoPRemPQR();
                    break;
                case 16:
                    obj.disjuncaoQRemPQR();
                    break;
                case 17:
                    obj.condicionalPeQemPQR();
                break;
                    
                case 18:
                    obj.condicionalPeRemPQR();
                    break;
                case 19:
                    obj.condicionalQeRemPQR();
                    break;
            }
    }

    
    leia.close();
    }
    
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

        for(int i=0; i<4; i++) {
            int k=0;
            
                if(matrizPQ[i][k]=="V") {
                    matrizPQ[i][k] = "F";
                } else if(matrizPQ[i][k]== "F") {
                    matrizPQ[i][k] = "V";
                }
            
        }
        System.out.println();
        for(int i=0; i<4; i++) {
            for(int j=0; j<2 ;j++) {
                System.out.print(matrizPQ[i][j] + "  ");
            }
            System.out.println();
        }   

    }

    public void negacaoQemPQ() {

        for(int i=0; i<4; i++) {
            int k=1;
            
                if(matrizPQ[i][k]=="V") {
                    matrizPQ[i][k] = "F";
                } else if(matrizPQ[i][k]== "F") {
                    matrizPQ[i][k] = "V";
                }
            
        }
        System.out.println();
        for(int i=0; i<4; i++) {
            for(int j=0; j<2 ;j++) {
                System.out.print(matrizPQ[i][j] + "  ");
            }
            System.out.println();
        }   

    }

    public void negacaoPemPQR() {

        for(int i=0; i<8; i++) {       
            int k=0;
                if(matrizPQR[i][k]=="V") {
                    matrizPQR[i][k] = "F";
                } else if(matrizPQR[i][k]== "F") {
                    matrizPQR[i][k] = "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {
            for(int j=0; j<3 ;j++) {
                System.out.print(matrizPQR[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public void negacaoQemPQR() {

        for(int i=0; i<8; i++) {       
            int k=1;
                if(matrizPQR[i][k]=="V") {
                    matrizPQR[i][k] = "F";
                } else if(matrizPQR[i][k]== "F") {
                    matrizPQR[i][k] = "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {
            for(int j=0; j<3 ;j++) {
                System.out.print(matrizPQR[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void negacaoRemPQR() {

        for(int i=0; i<8; i++) {       
            int k=2;
                if(matrizPQR[i][k]=="V") {
                    matrizPQR[i][k] = "F";
                } else if(matrizPQR[i][k]== "F") {
                    matrizPQR[i][k] = "V";
                } 
        }
        System.out.println();
        for(int i=0; i<8; i++) {
            for(int j=0; j<3 ;j++) {
                System.out.print(matrizPQR[i][j] + "  ");
            }
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