package br.com.exemplo.design.pattern.factory.pack;

import java.util.List;

public abstract class Pizza {

    protected List<Ingrediente> ingredientes;

    protected Pizza() {};

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
