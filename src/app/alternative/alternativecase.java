package app.alternative;

/*
 * Este arquivo é um exemplo do problema que o padrão Decorator resolve
 */
class Sorvete {
    private String sabor;

    public Sorvete(String sabor) {
        this.sabor = sabor;
    }

    public String getIngredientes() {
        return "Sorvete de uma bola sabor " + this.sabor;
    }

    public double getPreco() {
        return 5;
    }
}

class SorveteComCobertura extends Sorvete {

    public SorveteComCobertura(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
}

class SorveteComCoberturaEMorango extends Sorvete {

    public SorveteComCoberturaEMorango(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
}

class SorveteDuasBolas extends Sorvete {

    public SorveteDuasBolas(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
}

class SorveteDuasBolasComCobertura extends Sorvete {

    public SorveteDuasBolasComCobertura(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
}

class SorveteDuasBolasComCoberturaEMorango extends Sorvete {

    public SorveteDuasBolasComCoberturaEMorango(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
}

class SorveteDuasBolasComDuasCoberturas extends Sorvete {

    public SorveteDuasBolasComDuasCoberturas(String sabor) {
        super(sabor);
    }
    // Possui própria implementação de getIngredientes() e getPreco()
    
}
