
public class Conta {
         String nome_titular;
        double saldo;
        private double saldo_inicial = 0, valor_deposito, valor_sacar;


        public double getValor_sacar() {
            return this.valor_sacar;
        }

        public void setValor_sacar(double valor_sacar) {
            this.valor_sacar = valor_sacar;
        }

        public double getValor_deposito() {
            return this.valor_deposito;
        }

        public void setValor_deposito(double valor_deposito) {
            this.valor_deposito = valor_deposito;
        }

        public String getNome_titular() {
            return this.nome_titular;
        }

        public void setNome_titular(String nome_titular) {
            this.nome_titular = nome_titular;
        }

        public double getSaldo() {
            return this.saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo_inicial() {
            return this.saldo_inicial;
        }

        public void setSaldo_inicial(double saldo_inicial) {
            this.saldo_inicial = saldo_inicial;
        }


    public void defSaldo_Inicial() { 
        saldo = saldo_inicial;

    }


    public void Depositar() { 

        if (valor_deposito > 0) { 

            System.out.println("Sera depositado R$ " + getValor_deposito());
            saldo += valor_deposito;
            System.out.println("O saldo agora é de R$ " + getSaldo());

        }

        else { 

            System.out.println("Não foi possivel depositar");

        }

    }

    public void Sacar() {

        if (valor_sacar < saldo) { 

            System.out.println("Sera sacado R$ " + getValor_sacar());
            saldo -= valor_sacar;
            System.out.println("O saldo agora é de R$ " + getSaldo());

        }

        else { 

            System.out.println("Não foi possivel sacar");

        }

    }


    public void exebirConta() { 

        System.out.println("Ola " + getNome_titular() + ". O seu saldo atual é de :" + getSaldo());

    }

}
