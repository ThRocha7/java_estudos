import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrizA, matrizB, matrizSoma;
        int[] dimensoes = new int[2];

        System.out.println("Digite as dimensões das matrizes (As duas matrizes terão as mesmas dimensões): ");
        System.out.print("linhas: ");
        dimensoes[0] = sc.nextInt();
            
        System.out.print("colunas: ");
        dimensoes[1] = sc.nextInt();
        
        matrizA = new int[dimensoes[0]][dimensoes[1]];
        matrizB = new int[dimensoes[0]][dimensoes[1]];
        matrizSoma = new int[dimensoes[0]][dimensoes[1]];

        // Preenche as matrizes
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA[i].length; j++){
                System.out.print("Digite o item da posição " + "[" + i + "]" + "[" + j + "] " + "matriz A: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrizB.length; i++){
            for(int j = 0; j < matrizB[i].length; j++){
                System.out.print("Digite o item da posição " + "[" + i + "] " + "[" + j + "] " + "matriz B: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Soma as matrizes
        for(int i = 0; i < matrizSoma.length; i++){
            for(int j = 0; j < matrizSoma[i].length; j++){
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j]; 
            }
        }

        // Exibe
        System.out.println("Matriz A");
        exibirMatriz(matrizA);
        System.out.println("");

        System.out.println("Matriz B");
        exibirMatriz(matrizB);
        System.out.println("");
        
        System.out.println("Matriz Soma");
        exibirMatriz(matrizSoma);

        sc.close();
    }


    public static void exibirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }

}
