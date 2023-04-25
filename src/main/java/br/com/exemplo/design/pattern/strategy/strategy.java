package br.com.exemplo.design.pattern.strategy;

import br.com.exemplo.design.pattern.strategy.pack.Pessoa;
import br.com.exemplo.design.pattern.strategy.pack.PessoaFisicaValidator;
import br.com.exemplo.design.pattern.strategy.pack.ValidadorPessoa;

public class strategy {
    public static void main(String[] args) {
        var pessoa = new Pessoa("11111111111");
        ValidadorPessoa.validar(pessoa, new PessoaFisicaValidator());
    }
}
