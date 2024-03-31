public class Arara extends Animal{

    private int qtdeOvos;

    public int getQtdeOvos() {
        return this.qtdeOvos;
    }

    public void setQtdeOvos(int qtdeOvos) {
        this.qtdeOvos = qtdeOvos;
    }

    public Arara() {

        super("Ave", "Voa");
        this.qtdeOvos = 3;

    } 

}
