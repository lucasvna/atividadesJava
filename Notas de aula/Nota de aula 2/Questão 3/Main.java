import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        Triangulos t = new Triangulos();

            System.out.print("Digite o valor do 1° lado: ");
            t.setLado_1(sc.nextDouble());

            System.out.print("Digite o valor do 2° lado: ");
            t.setLado_2(sc.nextDouble());

            System.out.print("Digite o valor do 3° lado: ");
            t.setLado_3(sc.nextDouble());

        t.desc_Triangulo(); 

    }

}
