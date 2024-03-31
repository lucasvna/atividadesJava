public class Carro {

    protected String marca, modelo;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo) {

        this.marca = marca;
        this.modelo = modelo;

    }

    public void mostrarDetalhes() {

        System.out.println("Marca: " + getMarca() + " Modelo: " + getModelo());

    }

}
