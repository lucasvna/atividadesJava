import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); 
        Scanner sc = new Scanner(System.in); 

        int r,n1,n2; 

        System.out.println("Calculadora Java");

        do { 

            System.out.println("Digite qual a operação que voce deseja fazer.");
            System.out.print("1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão: ");
            int escolha = sc.nextInt();


            System.out.print("Digite o 1° numero: ");
            n1 = sc.nextInt(); 
            System.out.print("Digite o 2° numero: ");
            n2 = sc.nextInt(); 

            switch (escolha) { 

                case 1: 

                    System.out.println(calc.somar(n1,n2)); 
                    break;

                case 2:

                    System.out.println(calc.subtracao(n1,n2)); 
                    break; 

                case 3: 

                    System.out.println(calc.multiplicacao(n1, n2)); 
                    break;

                case 4: 

                    System.out.println(calc.divisao(n1, n2)); 
                    break;

                default: 

                    System.out.println("Ação invalida"); 
                    break;

            }
            
        System.out.print("Para uma executar uma nova operação, digite '0': ");
        r = sc.nextInt(); 

        }while (r == 0); 

        System.out.println("Obrigado por usar nosso programa :)"); 

    }

}
