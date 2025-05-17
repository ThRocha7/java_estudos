package pacote;

public class Aluno extends Pessoa{
    public String matricula;
    public double nota;
    
    void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
    }
}
