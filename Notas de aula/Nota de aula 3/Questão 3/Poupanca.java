package quest_3;

public class Poupanca extends Conta{

    private double selic, rendimento;

        public double getSelic() {
            return this.selic;
        }

        public void setSelic(double selic) {
            this.selic = selic;
        }

        public double getRendimento() {
            return this.rendimento;
        }

        public void setRendimento(double rendimento) {
            this.rendimento = rendimento;
        }


    public void calcRendimento() {
        if (selic > 8.5) {

            rendimento = 0.005 * saldo;

        }

        else { 

            rendimento = 0.007 * selic *saldo;

        }

        System.out.println("O redimento sera de: R$ " + getRendimento());

    }

}