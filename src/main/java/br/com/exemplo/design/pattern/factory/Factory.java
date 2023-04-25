package br.com.exemplo.design.pattern.factory;

import br.com.exemplo.design.pattern.factory.pack.PizzaFactory;

public class Factory {
    public static void main(String[] args) {
        var pizza1 = PizzaFactory.getInstance(true);
        var pizza2 = PizzaFactory.getInstance(false);

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
