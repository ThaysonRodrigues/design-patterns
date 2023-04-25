package br.com.exemplo.design.pattern.strategy.pack;

public class PessoaFisicaValidator implements Validador {

    @Override
    public void validar(Pessoa pessoa) {
        if (pessoa.getDocumento().length() > 11){
            throw new IllegalArgumentException("Problema com o CPF");
        }
    }
}
