import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        // Escreva um algoritmo que calcula o custo final de um produto que é composto de três matérias primas. Inicialmente são lidos os valores dos três materiais e a fórmula do custo é:
        // Custo = M01 + 3 * M02 + 2 * M03, onde M0x é uma matéria prima.
        // Você deve imprimir o valor do custo final. 
        float m01, m02, m03, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do 1° material: ");
        m01 = sc.nextFloat();
        System.out.println();

        System.out.print("Digite o valor do 2° material: ");
        m02 = sc.nextFloat();
        System.out.println();

        System.out.print("Digite o valor do 3° material: ");
        m03 = sc.nextFloat();
        System.out.println();

        resultado =  m01 + 3 * m02 + 2 * m03;

        System.out.println("O custo será de " + resultado);

        sc.close();
    }
}
