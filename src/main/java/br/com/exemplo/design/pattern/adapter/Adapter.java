package br.com.exemplo.design.pattern.adapter;

import br.com.exemplo.design.pattern.adapter.pack.PessoaAdapter;
import br.com.exemplo.design.pattern.adapter.pack.PessoaFisica;
import br.com.exemplo.design.pattern.adapter.pack.PessoaJuridica;

import java.util.Objects;

public class Adapter {

    public static void main(String[] args) {
        var joao = new PessoaFisica(null);
        var empresa = new PessoaJuridica("11.111.111/0001-11");

        var process = new PessoaProcessor();
        process.process(joao);
        process.process(empresa);
    }

    private static class PessoaProcessor {

        void process(PessoaAdapter adapter) {
            if (Objects.isNull(adapter.getRegister())) {
                System.out.printf("Registro não informado");
            }
        }
    }
}