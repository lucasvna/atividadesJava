public class Aluno extends Pessoa{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno (String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
        this.idade = idade;
    }
    public Aluno() {

    }
}
