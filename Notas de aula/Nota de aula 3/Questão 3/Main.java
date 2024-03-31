import java.util.Scanner; 
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Poupanca p = new Poupanca();
            Corrente c = new Corrente();

        int perg_conta, perg_rep, perg_op; 
        
        System.out.print("Digite qual a conta deseja usar? [1] Corrente; [2] Poupança: ");
        perg_conta = sc.nextInt();


        if (perg_conta == 1) {

            c.defSaldo_Inicial();
            System.out.print("Digite o nome do titular: ");
            c.setNome_titular(sc.next());


            do { 
                
                System.out.println("Qual operação você deseja realizar? [1] Depositar; [2] Sacar; [3] Usar Cheque Especial; [4] Exebir dados da conta :"); 
                perg_op = sc.nextInt();


                switch (perg_op) { 


                    case 1: 

                        System.out.print("Digite quanto vai ser depositado: ");
                        c.setValor_deposito(sc.nextDouble());
                        c.Depositar(); 
                        break;


                    case 2: 

                        System.out.print("Digite quanto vai ser sacado: ");
                        c.setValor_sacar(sc.nextDouble());
                        c.Sacar(); 
                        break;


                    case 3: //* Caso escolha usar o cheque especial:

                        System.out.println("Digite o valor para o cheque especial");
                        c.setValor_cheque(sc.nextDouble());
                        c.usarCheque(); 
                        break;


                    case 4: 
                        c.exebirConta(); 
                        break;


                    default: 
                        System.out.println("Operação invalida");
                        break;

                }
                
                System.out.print("Deseja fazer mais alguma operação? [0] Não; [1] Sim: ");
                perg_rep = sc.nextInt();

            } while (perg_rep == 1); 

        }


        if (perg_conta == 2) { 

            p.defSaldo_Inicial();
            System.out.print("Digite o nome do titular: ");
            p.setNome_titular(sc.next());
            
            do { 
                
                System.out.println("Qual operação você deseja realizar? [1] Depositar; [2] Sacar; [3] Calcular Rendimento; [4] Exebir dados da conta :"); 
                perg_op = sc.nextInt();


                switch (perg_op) { 


                    case 1: 

                        System.out.print("Digite quanto vai ser depositado: ");
                        p.setValor_deposito(sc.nextDouble());
                        p.Depositar(); 
                        break;

                    case 2: 

                        System.out.print("Digite quanto vai ser sacado: ");
                        p.setValor_sacar(sc.nextDouble());
                        p.Sacar(); 
                        break;


                    case 3: 

                        System.out.print("Quantos % esta a selic? ");
                        p.setSelic(sc.nextDouble());
                        p.calcRendimento(); 
                        break;


                    case 4: 

                        p.exebirConta(); 
                        break;


                    default: 

                        System.out.println("Operação invalida");
                        break;

                }
                
                System.out.print("Deseja fazer mais alguma operação? [0] Não; [1] Sim: ");
                perg_rep = sc.nextInt();

            } while (perg_rep == 1); 

        }

        System.out.println("Obrigado por usar o programa!");

    }

}
