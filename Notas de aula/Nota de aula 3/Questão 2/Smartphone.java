public class Smartphone extends Produtos {

    private int numero; 

        public int getNumero() {
            return this.numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

    public void testeLigacao() {  

        System.out.println("Ligando para o numero " + getNumero() + " ...");
        System.out.println("O celula esta funcionando.");
        System.out.println();

    }

}
