package app.sorveteria;

public abstract class Adicional implements Sorvete {
    private Sorvete sorvete;

    public Adicional(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String getIngredientes() {
        return sorvete.getIngredientes();
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco();
    }
}