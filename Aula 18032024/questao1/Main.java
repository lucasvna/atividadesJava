import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Digite A para cadastrar aluno ou P para cadastrar professor: ");
        resposta = sc.nextLine();

        if (resposta.equals("A")) {
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(sc.nextLine());
            System.out.println("Digite o a matrícula do aluno: ");
            aluno.setMatricula(sc.nextInt());
            System.out.println("Digite a idade do aluno: ");
            aluno.setIdade(sc.nextInt());
            System.out.println("Cadastro realizado. \nNome: " + aluno.getNome() + "\nMatrícula: " + aluno.getMatricula()
            + "\nIdade: " + aluno.getIdade() + " anos.");
        } else if (resposta.equals("P")) {
            System.out.println("Digite o nome do professor: ");
            professor.setNome(sc.nextLine());
            System.out.println("Digite o salário do professor: ");
            professor.setSalario(sc.nextInt());
            System.out.println("Digite a idade do professor: ");
            professor.setIdade(sc.nextInt());
            System.out.println("Cadastro realizado. \nNome: " + professor.getNome() + "\nSalário: R$" + professor.getSalario()
                    + "\nIdade: " + professor.getIdade());
        } else {
            System.out.println("Erro");
        }
    }
}