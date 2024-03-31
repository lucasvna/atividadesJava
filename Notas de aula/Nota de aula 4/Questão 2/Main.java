public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println("Peça: " + produto1.peca + " Preço: R$ " + produto1.preco + " Modelo: " + produto1.modelo);
        System.out.println();
        System.out.println("Peça: " + produto2.peca + " Preço: R$ " + produto2.preco + " Modelo: " + produto2.modelo);

    }

}
