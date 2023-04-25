package br.com.exemplo.design.pattern.singleton;

import br.com.exemplo.design.pattern.singleton.pack.ConfigurationAPI;

public class Singleton {

    public static void main(String[] args) {
        var configuration1 = ConfigurationAPI.getInstance();
        var configuration2 = ConfigurationAPI.getInstance();

        System.out.println(configuration1);
        System.out.println(configuration2);
    }
}