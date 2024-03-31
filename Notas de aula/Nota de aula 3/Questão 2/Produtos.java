public class Produtos {
  
        String Nome;
        int Estoque, Quant_venda;
        double Preço, Preço_final;

        public double getPreço_final() {
            return this.Preço_final;
        }

        public void setPreço_final(double Preço_final) {
            this.Preço_final = Preço_final;
        }

        public int getQuant_venda() {
            return this.Quant_venda;
        }

        public void setQuant_venda(int quant_venda) {
            this.Quant_venda = quant_venda;
        }

        public String getNome() {
            return this.Nome;
        }

        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        public int getEstoque() {
            return this.Estoque;
        }

        public void setEstoque(int Estoque) {
            this.Estoque = Estoque;
        }

        public double getPreço() {
            return this.Preço;
        }

        public void setPreço(double Preço) {
            this.Preço = Preço;
        }


    public void venderProduto() { 

        if (Quant_venda <= Estoque) { 

            System.out.println("Produto: " + getNome());
            System.out.println("Preço Unitario: " + getPreço());
            System.out.println("Quantidade Solicitada: " + getQuant_venda());
            setPreço_final(Quant_venda * Preço);
            System.out.println("Valor Final: " + getPreço_final());

        }

        else { 

            System.out.println("Não pode concluir a compra. Estoque baixo.");

        }

    }

}
