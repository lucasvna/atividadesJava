import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        Estoque e = new Estoque(); 

        System.out.print("Digite a quantidade do estoque atual: "); 
        e.setQuant_atual(sc.nextInt()); 

        System.out.print("Digite a quantidade maxima do estoque: "); 
        e.setEstoque_max(sc.nextInt());

        System.out.print("Digite a quantidade minima do estoque: "); 
        e.setEstoque_min(sc.nextInt()); 

        e.calc_media(); 

    }
    
}
