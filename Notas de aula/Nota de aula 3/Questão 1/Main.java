import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        Gerente g = new Gerente(); 
        Diretor d = new Diretor();

        int perg; 
      
        System.out.print("Digite 1 se você é um Gerente ou digite 2 se você é Diretor: ");
        perg = sc.nextInt(); 

        switch (perg) {

            case 1:
        
                    System.out.print("Digite seu nome: ");
                    g.setNome(sc.next());
                    System.out.print("Digite seu salario: ");
                    g.setSalario(sc.nextDouble());
                    System.out.print("Digite seu departamento: ");
                    g.setDepartamento(sc.next());
                    System.out.println();

                g.calc_bonus(); 

                break;

            case 2:
                    
                    System.out.print("Digite seu nome: ");
                    d.setNome(sc.next());
                    System.out.print("Digite seu salario: ");
                    d.setSalario(sc.nextDouble());
                    System.out.print("Digite a a quantidade de ações que você possui: ");
                    d.setAcoes(sc.nextInt());
                    System.out.println();

                d.exe_infos_Diretor(); 

                break;

            default: 

                System.out.println("Operação errada"); 
                break;

        }

    }

}
