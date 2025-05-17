package pacote;

public class Secretario extends Pessoa {
    public double salario;
    
    void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + this.salario);
    }
}
