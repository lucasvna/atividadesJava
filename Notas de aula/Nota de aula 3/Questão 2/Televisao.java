public class Televisao extends Produtos{

    private int canal_cadrastrado; 

        public int getCanal_cadrastrado() {
            return this.canal_cadrastrado;
        }

        public void setCanal_cadrastrado(int canal_cadrastrado) {
            this.canal_cadrastrado = canal_cadrastrado;
        }

    public void acessarCanais() { 

            System.out.println("Testando canal " + getCanal_cadrastrado() + "...");
            System.out.println("Canal " + getCanal_cadrastrado() + " está funcionando.");
            System.out.println();

    }

}
