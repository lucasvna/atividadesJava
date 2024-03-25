import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        
    Aluno a = new Aluno(); 
    Scanner sc = new Scanner(System.in); 

    System.out.print("Digite o nome do aluno: ");
    a.nome = sc.next();

    System.out.print("Digite a 1° Nota: ");
    a.nota_1 = sc.nextDouble(); 

    System.out.print("Digite a 2° Nota: "); 
    a.nota_2 = sc.nextDouble(); 

    System.out.print("Digite a 3° Nota: "); 
    a.nota_3 = sc.nextDouble(); 

    a.calcular_media(); 

    System.out.println("A media de "+a.nome+" foi de: "+a.media); 

    if (a.media >= 7) { 

        System.out.println("Aluno aprovado"); 

    }

    else { 

        System.out.println("Aluno reprovado"); 

    }

    }

}
