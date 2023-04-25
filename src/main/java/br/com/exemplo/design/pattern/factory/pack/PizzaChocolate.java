package br.com.exemplo.design.pattern.factory.pack;

import java.util.List;

public class PizzaChocolate extends Pizza {

    protected PizzaChocolate () {
        this.ingredientes = List.of(
                new Ingrediente("Chocolate"),
                new Ingrediente("Creme de Leite"),
                new Ingrediente("Raspas de chocolate")
        );
    }
}