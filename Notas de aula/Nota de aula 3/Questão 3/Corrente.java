package quest_3;

public class Corrente extends Conta{

    private double valor_cheque, cheque_especial = 1000;

        public double getValor_cheque() {
            return this.valor_cheque;
        }

        public void setValor_cheque(double valor_cheque) {
            this.valor_cheque = valor_cheque;
        }

    public void usarCheque() {

        if (cheque_especial + saldo >= valor_cheque) {

            saldo -= valor_cheque;
            System.out.println("Aplicando o Cheque Especial. Novo saldo: " + getSaldo());

        }

        else {

            System.out.println("Não é possivel fazer o cheque especial");

        }

    }


}
