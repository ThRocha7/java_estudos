package pacote;

public class App {
    public static void main(String[] args) throws Exception {
        Professor professor1 = new Professor();
        professor1.nome = "Fábio";
        professor1.email = "fabio@gmail.com";
        professor1.telefone = "16988888888";
        professor1.idade = 30;
        professor1.sexo = 'M';
        professor1.cpf = "12345678901";
        professor1.salario = 5.500;
        professor1.disciplinas = "Banco de dados;Estrutura de dados";
        professor1.exibirDados();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Alberto";
        aluno1.email = "alberto@gmail.com";
        aluno1.telefone = "16988888881";
        aluno1.idade = 20;
        aluno1.sexo = 'M';
        aluno1.cpf = "32145678902";
        aluno1.matricula = "R12345";
        aluno1.nota = 5.5;
        aluno1.exibirDados();

        Secretario secretario1 = new Secretario();
        secretario1.nome = "Aladim";
        secretario1.email = "aladim@gmail.com";
        secretario1.telefone = "16988888882";
        secretario1.idade = 50;
        secretario1.sexo = 'M';
        secretario1.cpf = "12365478903";
        secretario1.salario = 3.500;
        secretario1.exibirDados();
    }
}
