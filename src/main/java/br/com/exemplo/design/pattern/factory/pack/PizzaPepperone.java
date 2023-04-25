package br.com.exemplo.design.pattern.factory.pack;

import java.util.List;

public class PizzaPepperone extends Pizza {

    protected PizzaPepperone() {
        this.ingredientes = List.of(
                new Ingrediente("Tomate"),
                new Ingrediente("Queijo"),
                new Ingrediente("Sal"),
                new Ingrediente("Orégano"),
                new Ingrediente("Calabresa"),
                new Ingrediente("Cebola")
        );
    }

}
