import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Veiculo> garagem = new ArrayList<>();

        garagem.add(new Carro(
            "XAQ1Q12",  
            "HONDA",    
            "CIVIC",
            4
        ));

        garagem.add(new Carro(
            "ABC2D23",
            "HONDA",
            "CITY",
            4
        ));

        garagem.add(new Moto(
            "CBA3X45",
            "HONDA",
            "TITAN",
            150
        ));

        for (int i = 0; i < garagem.size(); i++){
            garagem.get(i).exibirDados();
            System.out.println("-------------");
        }
    }
}