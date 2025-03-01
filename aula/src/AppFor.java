import java.util.Scanner;

public class AppFor {
    public static void main(String[] args){
        // printando os pares sem usar condicionais
        // for(int i = 0; i <= 250; i++){
        //     System.out.println(i*2);
        // }
        // ---------------------------------
        // Fatorial
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para se calcular seu fatorial: ");
        int input_num = sc.nextInt();

        int fat = 1;
        for(int i = input_num; i > 0; i--){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
