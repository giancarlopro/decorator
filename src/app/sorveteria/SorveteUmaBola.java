package app.sorveteria;

public class SorveteUmaBola implements Sorvete {

    private String sabor;

    public SorveteUmaBola(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String getIngredientes() {
        return "Sorvete de uma bola de " + this.sabor;
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
