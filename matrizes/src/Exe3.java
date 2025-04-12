import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[][] matrizA, matrizB, matrizMult;
    
        System.out.println("Digite as dimensões da matriz A: ");
        matrizA = criaMatriz(sc);

        System.out.println("Digite as dimensões da matriz B: ");
        matrizB = criaMatriz(sc);

        if(matrizA[0].length != matrizB.length){
            System.out.println("Não é possível realizar a multiplicação dessas matrizes!");
        } else{
            matrizMult = new int[matrizA.length][matrizB[0].length];

            for(int i = 0; i < matrizMult.length; i++){
                for(int j = 0; j < matrizMult[i].length; j++){
                    for (int k = 0; k < matrizMult.length+1; k++) {
                        matrizMult[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("Matriz A");
            exibirMatriz(matrizA);
            System.out.println("");
    
            System.out.println("Matriz B");
            exibirMatriz(matrizB);
            System.out.println("");
            
            System.out.println("Matriz Multiplicada");
            exibirMatriz(matrizMult);
    
            sc.close();

        }

    }

    public static int[][] criaMatriz(Scanner sc){
        int[] dimensoes = new int[2];
        System.out.print("linhas: ");
        dimensoes[0] = sc.nextInt();
            
        System.out.print("colunas: ");
        dimensoes[1] = sc.nextInt();
    
        int[][] matriz = new int[dimensoes[0]][dimensoes[1]];
        matriz = preencheMatriz(matriz, sc);
        return matriz;
    }

    public static int[][] preencheMatriz(int[][] matriz, Scanner sc){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Digite o item da posição " + "[" + i + "]" + "[" + j + "] " + "matriz: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
