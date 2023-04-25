package br.com.exemplo.design.pattern.factory.pack;

public class PizzaFactory {

    private PizzaFactory() {}

    public static Pizza getInstance(boolean isDoce) {
        return isDoce ? new PizzaChocolate() : new PizzaPepperone();
    }

}