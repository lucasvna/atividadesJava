public class Funcionarios { 
    
    int matricula; 
    String nome; 
    double salario_bruto; 


    public void calc_deducao() { 

        double deducao = salario_bruto * 0.15; 
        double salario_liquido = salario_bruto - deducao;

        System.out.println("Quanto sera deduzido do INSS (15%): " + deducao); 
        System.out.println("Salario Liquido apos dedução: "+ salario_liquido); 
        return;

    }

}
