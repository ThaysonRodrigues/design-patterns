package br.com.exemplo.design.pattern.strategy.pack;

public class PessoaJuridicaValidator implements Validador {

    @Override
    public void validar(Pessoa pessoa) {
        if (pessoa.getDocumento().length() < 14){
            throw new IllegalArgumentException("Problema com o CNPJ");
        }
    }
}
