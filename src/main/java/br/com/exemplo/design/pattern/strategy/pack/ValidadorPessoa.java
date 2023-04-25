package br.com.exemplo.design.pattern.strategy.pack;

public class ValidadorPessoa {

    private ValidadorPessoa() {}

    public static void validar(Pessoa pessoa, Validador v) {
        v.validar(pessoa);
    }

}
