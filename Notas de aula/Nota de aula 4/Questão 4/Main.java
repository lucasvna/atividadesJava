public class Main {

    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leão:");
        leao.exebirInformacoes();

        System.out.println();

        System.out.println("Informações da Arara:");
        System.out.println();
        System.out.println("Classe: " + arara.getClasse());
        System.out.println("Locomoçao: " + arara.getLocomocao());
        System.out.println("Quantidade de ovos: " + arara.getQtdeOvos());

    }

}
