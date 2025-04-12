import java.util.Scanner;
import java.util.Random;

public class Exe1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] dimensoes =  new int[2]; 
        int[][] matriz;
        
        System.out.println("Digite as dimensões da matriz: ");
        System.out.print("linhas: ");
        dimensoes[0] = sc.nextInt();
            
        System.out.print("colunas: ");
        dimensoes[1] = sc.nextInt();
        
        matriz = new int[dimensoes[0]][dimensoes[1]];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                int numRandom = rand.nextInt(101);
                matriz[i][j] = numRandom;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }

        sc.close();
    }
}
