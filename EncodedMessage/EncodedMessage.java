import java.util.Scanner;
import java.lang.Math;
public class EncodedMessage {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int numberOfCases = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numberOfCases; i++) {
            String line = sc.nextLine();
            int matrixSize = (int)Math.sqrt(line.length()) ; 
            char[][] poemMatrix = new char[matrixSize][matrixSize]; 
            int j = 0;
            for (int index=0; index<matrixSize; index++){
                for (int k=0; k<matrixSize; k++){
                    poemMatrix[index][k]= line.charAt(j); 
                    j++;
                }        
            }
            char[][] newPoemMatrix = new char[matrixSize][matrixSize];
            int b = matrixSize -1;
            for (int index=0; index<matrixSize; index++){
                int a = 0;
                for (int k=0; k<matrixSize; k++){
                    newPoemMatrix[index][k] = poemMatrix[a][b]; 
                    a++;
                }
                b--;
            }
            
            char[] poemTogether = new char[line.length()];
            int a = 0;
            b = 0;
            for (j=0; j<line.length(); j++){ 
                poemTogether[j] = newPoemMatrix[a][b]; 
                if (b == matrixSize - 1){
                    a++; 
                    b = 0; 
                }
                else 
                    b++;      
            }
            String result = String.valueOf(poemTogether);
            System.out.println(result) ;        
            }      
            
        
    }
    }