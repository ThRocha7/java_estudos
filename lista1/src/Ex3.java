import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        //leia o peso e a altura de uma pessoa adulta, calcula e imprime o Índice de Massa Corporal (IMC), cuja fórmula é: IMC = peso / altura²
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println();

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println();

        imc = peso / Math.pow(altura, 2);

        System.out.println("Seu IMC é: " + imc);
        sc.close();
    }
}
