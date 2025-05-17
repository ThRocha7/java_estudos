package pacote;

public class Professor extends Pessoa{
    public double salario;
    public String disciplinas;
    
    void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplinas: " + this.disciplinas);
    }
}