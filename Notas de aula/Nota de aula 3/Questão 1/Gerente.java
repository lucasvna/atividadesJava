public class Gerente extends Funcionarios { 
        
        private String departamento;
        private double bonus = 0.1, novo_salario;

        public String getDepartamento() {
            return this.departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public double getBonus() {
            return this.bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
    
    public void calc_bonus() { 

        novo_salario = salario * bonus; 
        System.out.println("Olá, "+nome);
        System.out.println("Você é do departamento de: "+departamento);
        System.out.println("Seu salário com o acréscimo é de: "+novo_salario);

    }

}
