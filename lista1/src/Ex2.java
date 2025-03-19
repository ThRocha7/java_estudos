import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Escreva um algoritmo para calcular e imprimir o volume de uma esfera de raio R que é fornecido pelo usuário. O volume de uma esfera é dado pela formula: v=4πR3/3.
        Scanner sc = new Scanner(System.in);
        float raio;

        System.out.print("Digite um raio para calcular o volume: ");
        raio = sc.nextFloat();
        System.out.println();
        
        double volume = 4 * 3.14 * raio * 3 / 3;

        System.out.println("O volume da esfera de raio " + raio + " é igaul a: " + volume );
        sc.close();
    }
}
