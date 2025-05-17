package pacote;

public class Pessoa{
    public String nome;
    public String email;
    public String telefone;
    public int idade;
    public char sexo;
    public String cpf;
    
    void exibirDados(){   
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("CPF: " + this.cpf);
    }
}
