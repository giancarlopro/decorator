package app.sorveteria;

public class Morango extends Adicional {

    public Morango(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + " e com morango";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.5;
    }
}