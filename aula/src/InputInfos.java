import java.util.Scanner;

public class InputInfos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Sua idade é: " + idade);
    }
}
