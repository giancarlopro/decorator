package app.sorveteria;

/**
 * SorveteDuasBolas
 */
public class SorveteDuasBolas implements Sorvete {

    private String saborPrimeiraBola;
    private String saborSegundaBola;

    public SorveteDuasBolas(String saborPrimeiraBola, String saborSegundaBola) {
        this.saborPrimeiraBola = saborPrimeiraBola;
        this.saborSegundaBola = saborSegundaBola;
    }

    public SorveteDuasBolas(String sabor) {
        this.saborPrimeiraBola = sabor;
        this.saborSegundaBola = sabor;
    }

    @Override
    public String getIngredientes() {
        return "Sorvete de duas bolas, uma de " + this.saborPrimeiraBola + " e outra de " + this.saborSegundaBola;
    }

    @Override
    public double getPreco() {
        return 7;
    }
}