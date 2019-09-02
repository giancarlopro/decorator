package app.sorveteria;

public class Cobertura extends Adicional {

    private String sabor;

    public Cobertura(Sorvete sorvete, String sabor) {
        super(sorvete);
        this.sabor = sabor;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + " e com cobertura de " + this.sabor;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.7;
    }
}