public class Animal {

    protected String classe, locomocao;

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLocomocao() {
        return this.locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public Animal(String classe, String locomocao) {

        this.classe = classe;
        this.locomocao = locomocao;

        }

}
