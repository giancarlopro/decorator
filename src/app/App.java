package app;

import app.sorveteria.Cobertura;
import app.sorveteria.Morango;
import app.sorveteria.Sorvete;
import app.sorveteria.SorveteUmaBola;

public class App {
    public static void main(String[] args) throws Exception {
        Sorvete meuSorvete = new SorveteUmaBola("chocolate");
        meuSorvete = new Cobertura(meuSorvete, "uva");
        meuSorvete = new Cobertura(meuSorvete, "banana");
        meuSorvete = new Morango(meuSorvete);

        System.out.println("Ingredientes: " + meuSorvete.getIngredientes());
        System.out.println("Preço: " + meuSorvete.getPreco());
    }
}