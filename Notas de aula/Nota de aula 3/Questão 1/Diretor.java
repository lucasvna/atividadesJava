public class Diretor extends Funcionarios { 
 
    private int acoes; 

        public int getAcoes() {
            return this.acoes;
        }

        public void setAcoes(int acoes) {
            this.acoes = acoes;
        }

    public void exe_infos_Diretor() {

        System.out.println("Ola "+nome);
        System.out.println("Seu salario é de: "+salario);
        System.out.println("Você tem "+acoes+"% das ações da empresa");

    }
    
}
