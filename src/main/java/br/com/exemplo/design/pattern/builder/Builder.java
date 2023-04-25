package br.com.exemplo.design.pattern.builder;

import br.com.exemplo.design.pattern.builder.pack.Endereco;
import br.com.exemplo.design.pattern.builder.pack.EnderecoBuilder;

public class Builder {

    public static void main(String[] args) {

        var endereco = Endereco.builder()
                .cidade("Cidade de Deus")
                .rua("rua da paz")
                .numero(10)
                .bairro("Bairro das palmeiras")
                .complemento("Apartamento");

        var endereco2 = EnderecoBuilder.builder()
                .cidade("Cidade 2")
                .rua("Rua 2")
                .bairro("Bairro 2")
                .numero(20)
                .build();

        System.out.println(endereco);
        System.out.println(endereco2);
    }
}
