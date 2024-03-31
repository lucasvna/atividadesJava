public class Leao extends Animal{

    private String pelo;

    public String getPelo() {
        return this.pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public Leao(String classe, String locomocao, String pelo) {

        super(classe, locomocao);
        this.pelo = pelo;

    }

    public void exebirInformacoes() {

        System.out.println();
        System.out.println("Classe: " + getClasse());
        System.out.println("Locomoçao: " + getLocomocao());
        System.out.println("Tipo de pelo: " + pelo);

    }

}
