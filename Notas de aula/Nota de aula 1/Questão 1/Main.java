import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {

        String r; 

        Funcionarios f = new Funcionarios(); 
        Scanner sc = new Scanner(System.in); 

        do { 

            System.out.println();
            System.out.println("Programa da folha de pagamento dos funcionarios"); 
            System.out.println(); 

            System.out.print("Digite o nome do funcionario: "); 
            f.nome = sc.next(); 

            System.out.print("Digite a matricula do funcionario: "); 
            f.matricula = sc.nextInt(); 

            System.out.print("Digite o salario bruto do funcionario: "); 
            f.salario_bruto = sc.nextDouble(); 


            System.out.println(); 
            System.out.println("Exibindo os dados");
            System.out.println(); 
            System.out.println("Nome do Funcionario: " + f.nome); 
            System.out.println("Matricula: " + f.matricula); 
            System.out.println("Salario Bruto: " + f.salario_bruto); 
            f.calc_deducao(); 


            System.out.println(); 
            System.out.print("Para usar o programa denovo, digite 'S'; Se não quiser executar, digite 'N': ");  
            r = sc.next();  
    

            if (r.equalsIgnoreCase("N")){ 

                System.out.println("Obrigado por usar o programa"); 
                break; 
    
            }


        } while (r.equalsIgnoreCase("S")); 

        
    }
    
}
